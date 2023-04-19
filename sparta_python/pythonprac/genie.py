import requests
from bs4 import BeautifulSoup

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get('https://www.genie.co.kr/chart/top200?ditc=M&rtm=N&ymd=20230101', headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

#body-content > div.newest-list > div > table > tbody > tr:nth-child(1)
#body-content > div.newest-list > div > table > tbody > tr:nth-child(2)

lis = soup.select('#body-content > div.newest-list > div > table > tbody > tr')

#body-content > div.newest-list > div > table > tbody > tr:nth-child(1) > td.number
#body-content > div.newest-list > div > table > tbody > tr:nth-child(1) > td.info > a.title.ellipsis
#body-content > div.newest-list > div > table > tbody > tr:nth-child(1) > td.info > a.artist.ellipsis

for li in lis:
    r = li.select_one('td.number')
    rank = r.text[0:2].strip()
    t = li.select_one('td.info > a.title.ellipsis')
    title = t.text.strip()
    s = li.select_one('td.info > a.artist.ellipsis')
    singer = s.text.strip()
    print(rank, title, singer)