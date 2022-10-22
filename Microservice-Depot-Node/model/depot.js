var mongoose  = require('mongoose');
var Schema = mongoose.Schema;

var Depot = new Schema({
    Adresse :{type :String} ,
    Capacite :{type :Number}, 
    Etat :{type :String}, 
    PrixLocation :{type :Number}, 

});

module.exports = mongoose.model('depots', Depot);
