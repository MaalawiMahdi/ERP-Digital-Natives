const express = require("express");
const app = express();
var router = express.Router();
var Depot = require('../model/depot')

app.post("/add", async (request, response) => {
    const depot = new Depot(request.body);
  
    try {
      await depot.save();
      response.send(depot);
    } catch (error) {
      response.status(500).send(error);
    }
});
app.get("/get", async (request, response) => {
    console.log("ok");
    const depots = await Depot.find();
  
    try {
      response.send(depots);
    } catch (error) {
      response.status(500).send(error);
    }
  });

  app.post("/update", async (request, response) => {
   
    
    try {
        await  Depot.findById(request.body.id, (err, depot) => {
        depot.Adresse = request.body.Adresse,
        depot.Capacite = request.body.Capacite,
        depot.Etat = request.body.Etat,
        depot.PrixLocation = request.body.PrixLocation,
        depot.save()
    
   
            response.send(" ok ")
   
    }).clone()
}catch (error) {
        response.status(500).send(error);
      }
   
  
});


app.get('/delete/:id', (request, res, next)=>{
    Depot.findByIdAndDelete(request.params.id, (err, result) => {

     if (!err) {res.status(200).send("Deleted")}
     else {res.status(400).send(err)}
 })
});
module.exports = app;