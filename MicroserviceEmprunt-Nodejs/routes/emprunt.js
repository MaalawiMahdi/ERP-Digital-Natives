const express = require("express");
const app = express();
var router = express.Router();
var Emprunt = require('../model/emprunt')

app.post("/add", async (request, response) => {
    const emprunt = new Emprunt(request.body);
  
    try {
      await emprunt.save();
      response.send(emprunt);
    } catch (error) {
      response.status(500).send(error);
    }
});
app.get("/getAll", async (request, response) => {
    const emprunt = await Emprunt.find();
  
    try {
      response.send(emprunt);
    } catch (error) {
      response.status(500).send(error);
    }
  });
  app.get("/getByid/:id", async (request, response) => {
    const emprunt = await Emprunt.findById(request.params.id);
  
    try {
      response.send(emprunt);
    } catch (error) {
      response.status(500).send(error);
    }
  });
app.post("/update/:id", async (request, response) => {
   
    
    try {
        await  Emprunt.findById(request.params.id, (err, emprunt) => {
            emprunt.Somme = request.body.Somme
            emprunt.DateDebut = request.body.DateDebut
            emprunt.DateFin = request.body.DateFin
            emprunt.TauxInteret = request.body.TauxInteret
            emprunt.Etat=request.body.Etat
            emprunt.save()
    
   
            response.send(" ok ")
   
    }).clone()
}catch (error) {
        response.status(500).send(error);
      }
   
  
});


app.post('/delete/:id', (request, res, next)=>{
    Emprunt.findByIdAndDelete(request.params.id, (err, result) => {

     if (!err) {res.status(200).send("Deleted")}
     else {res.status(400).send(err)}
 })
});
module.exports = app;