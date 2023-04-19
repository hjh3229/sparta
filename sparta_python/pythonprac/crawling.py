from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.szcxpef.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

import requests
from bs4 import BeautifulSoup

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get('https://movie.daum.net/ranking/reservation', headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

lis = soup.select('#mainContent > div > div.box_ranking > ol > li')

#mainContent > div > div.box_ranking > ol > li:nth-child(1) > div > div.thumb_item > div.poster_info > a
#mainContent > div > div.box_ranking > ol > li:nth-child(1) > div > div.thumb_cont > span.txt_append > span:nth-child(1) > span
#mainContent > div > div.box_ranking > ol > li:nth-child(1) > div > div.thumb_item > div.poster_movie > span.rank_num
for li in lis:
    a = li.select_one('div > div.thumb_cont > strong > a')
    title = a.text
    span = li.select_one('div > div.thumb_cont > span.txt_append > span:nth-child(1) > span')
    star = span.text
    rank_num = li.select_one('div > div.thumb_item > div.poster_movie > span.rank_num')
    rank = rank_num.text
    doc = {
        'title' : title,
        'rank' : rank,
        'star' : star
    }
    db.movies.insert_one(doc)