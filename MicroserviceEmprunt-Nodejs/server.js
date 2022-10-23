const express = require("express");
const mongoose = require("mongoose");
const Router = require("./routes/emprunt")

const app = express();

app.use(express.json());
mongoose.connect('mongodb+srv://admin:adminerp@cluster0.fvej78n.mongodb.net/EmpruntDb');
const db = mongoose.connection;
db.on("error", console.error.bind(console, "connection error: "));
db.once("open", function () {
  console.log("Connected successfully");
});
app.use("/api/emprunt",Router);

app.listen(8091, () => {
  console.log("Server is running at port 8091");
});
