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
db.colors.insert({
    "en": {
      "plural": "blue",
      "singular": "blue"
    }
  });
db.colors.insert({
    "en": {
      "plural": "red",
      "singular": "red"
    }
  });
db.colors.insert({
    "en": {
      "plural": "green",
      "singular": "green"
    }
  });
db.colors.insert({
    "en": {
      "plural": "white",
      "singular": "white"
    }
  });
db.colors.insert({
    "en": {
      "plural": "black",
      "singular": "black"
    }
  });
db.colors.insert({
    "en": {
      "plural": "yellow",
      "singular": "yellow"
    }
  });
db.colors.insert({
    "en": {
      "plural": "grey",
      "singular": "grey"
    }
  });
db.colors.insert({
    "en": {
      "plural": "brown",
      "singular": "brown"
    }
  });
db.colors.insert({
    "en": {
      "plural": "orange",
      "singular": "orange"
    }
  });
db.colors.insert({
    "en": {
      "plural": "purple",
      "singular": "purple"
    }
  });
db.colors.insert({
    "en": {
      "plural": "pink",
      "singular": "pink"
    }
  });

db.apparel.drop();
db.apparel.insert({
    "en": {
      "plural": "tshirts",
      "singular": "tshirt"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "shirts",
      "singular": "shirt"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "jackets",
      "singular": "jacket"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "jeans",
      "singular": "jean"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "trousers",
      "singular": "trouser"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "blazers",
      "singular": "blazer"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "waistcoats",
      "singular": "waistcoat"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "suit",
      "singular": "suits"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "shorts",
      "singular": "short"
    }
  });
db.apparel.insert({
    "en": {
      "plural": "cargos",
      "singular": "cargo"
    }
  });

db.fabrics.drop();
db.fabrics.insert({
    "en": {
      "plural": "cotton",
      "singular": "cotton"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "linen",
      "singular": "linen"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "silk",
      "singular": "silk"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "polyester",
      "singular": "polyester"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "wool",
      "singular": "wool"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "nylon",
      "singular": "nylon"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "rayon",
      "singular": "rayon"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "lycra",
      "singular": "lycra"
    }
  });
db.fabrics.insert({
    "en": {
      "plural": "spandex",
      "singular": "spandex"
    }
  });