var db = connect('127.0.0.1:27017/dialecto');

db.languages.drop();
db.languages.insert({'code' : 'en', 'name' : 'english'});
db.languages.insert({'code' : 'hi', 'name' : 'hindi'});
db.languages.insert({'code' : 'gu', 'name' : 'gujrati'});
db.languages.insert({'code' : 'ml', 'name' : 'malayalam'});
db.languages.insert({'code' : 'mr', 'name' : 'marathi'});
db.languages.insert({'code' : 'pa', 'name' : 'punjabi'});
db.languages.insert({'code' : 'te', 'name' : 'telugu'});
db.languages.insert({'code' : 'ta', 'name' : 'tamil'});
db.languages.insert({'code' : 'bn', 'name' : 'bengali'});
db.languages.insert({'code' : 'kn', 'name' : 'kannada'});
db.languages.insert({'code' : 'or', 'name' : 'odiya'});

db.colors.drop();
db.colors.insert({'code' : 'en', 'name' : 'english'});
db.colors.insert({'code' : 'hi', 'name' : 'hindi'});
db.colors.insert({'code' : 'gu', 'name' : 'gujrati'});
db.colors.insert({'code' : 'ml', 'name' : 'malayalam'});
db.colors.insert({'code' : 'mr', 'name' : 'marathi'});
db.colors.insert({'code' : 'pa', 'name' : 'punjabi'});
db.colors.insert({'code' : 'te', 'name' : 'telugu'});
db.colors.insert({'code' : 'ta', 'name' : 'tamil'});
db.colors.insert({'code' : 'bn', 'name' : 'bengali'});
db.colors.insert({'code' : 'kn', 'name' : 'kannada'});
db.colors.insert({'code' : 'or', 'name' : 'odiya'});
