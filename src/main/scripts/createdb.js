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
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "blue",
      "singular": "blue"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "red",
      "singular": "red"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "green",
      "singular": "green"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "white",
      "singular": "white"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "black",
      "singular": "black"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "yellow",
      "singular": "yellow"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "grey",
      "singular": "grey"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "brown",
      "singular": "brown"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "orange",
      "singular": "orange"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "purple",
      "singular": "purple"
    }
  ]});
db.colors.insert({"entries": [
    {
      "language": "en",
      "plural": "pink",
      "singular": "pink"
    }
  ]});

db.apparel.drop();
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "tshirts",
      "singular": "tshirt"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "shirts",
      "singular": "shirt"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "jackets",
      "singular": "jacket"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "jeans",
      "singular": "jean"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "trousers",
      "singular": "trouser"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "blazers",
      "singular": "blazer"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "waistcoats",
      "singular": "waistcoat"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "suit",
      "singular": "suits"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "shorts",
      "singular": "short"
    }
  ]});
db.apparel.insert({"entries": [
    {
      "language": "en",
      "plural": "cargos",
      "singular": "cargo"
    }
  ]});

db.fabrics.drop();
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "cotton",
      "singular": "cotton"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "linen",
      "singular": "linen"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "silk",
      "singular": "silk"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "polyester",
      "singular": "polyester"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "wool",
      "singular": "wool"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "nylon",
      "singular": "nylon"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "rayon",
      "singular": "rayon"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "lycra",
      "singular": "lycra"
    }
  ]});
db.fabrics.insert({"entries": [
    {
      "language": "en",
      "plural": "spandex",
      "singular": "spandex"
    }
  ]});