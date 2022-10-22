var mongoose  = require('mongoose');
var Schema = mongoose.Schema;

var Facture = new Schema({
    DateDeCreation :{type :Date} ,
    Somme :{type :Number}, 
});

module.exports = mongoose.model('facture', Facture);
