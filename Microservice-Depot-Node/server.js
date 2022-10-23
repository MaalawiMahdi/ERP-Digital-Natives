const express = require("express");
const mongoose = require("mongoose");
const Router = require("./routes/depot")

const app = express();

app.use(express.json());
mongoose.connect('mongodb+srv://admin:adminerp@cluster0.fvej78n.mongodb.net/Depotdb');
const db = mongoose.connection;
db.on("error", console.error.bind(console, "connection error: "));
db.once("open", function () {
  console.log("Connected successfully");
});


app.use("/api/depot",Router);

app.listen(3001, () => {
  console.log("Server is running at port 3001");
});
