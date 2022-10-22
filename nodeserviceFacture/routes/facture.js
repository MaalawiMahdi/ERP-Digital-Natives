const express = require("express");
const app = express();
var router = express.Router();
var Facture = require('../model/Facture')

app.post("/add", async (request, response) => {
    const facture = new Facture(request.body);
  
    try {
      await facture.save();
      response.send(facture);
    } catch (error) {
      response.status(500).send(error);
    }
});
app.get("/get", async (request, response) => {
    console.log("ok");
    const factures = await Facture.find();
  
    try {
      response.send(factures);
    } catch (error) {
      response.status(500).send(error);
    }
  });

  app.post("/update", async (request, response) => {
   
    
    try {
        await  Facture.findById(request.body.id, (err, facture) => {
        facture.DateDeCreation = request.body.DateDeCreation,
        facture.Somme = request.body.Somme,
        
        facture.save()
    
   
            response.send(" ok ")
   
    }).clone()
}catch (error) {
        response.status(500).send(error);
      }
   
  
});


app.get('/delete/:id', (request, res, next)=>{
    Facture.findByIdAndDelete(request.params.id, (err, result) => {

     if (!err) {res.status(200).send("Deleted")}
     else {res.status(400).send(err)}
 })
});
module.exports = app;