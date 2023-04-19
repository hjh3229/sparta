from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.szcxpef.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

movie = db.movies.find_one({'title':'리바운드'})
target_star = movie['star']

titles = list(db.users.find({'star':target_star},{'_id':False}))
for a in titles:
    print(a['title'])

db.movies.update_one({'title':'리바운드'},{'$set':{'star':0}})