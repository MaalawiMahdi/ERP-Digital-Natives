var mongoose  = require('mongoose');
var Schema = mongoose.Schema;

var Emprunt = new Schema({
    Somme :{type :Number} ,
    DateDebut :{type :Date}, 
    DateFin :{type :Date}, 
    TauxInteret :{type :Number}, 
    Etat:{type:String}

});

module.exports = mongoose.model('emprunts', Emprunt);
