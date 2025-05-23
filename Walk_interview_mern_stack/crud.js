// To Create a Simple CRUD API with node.js, Express, and MongoDb;



const express = require('express');
const router = express.Router();
const User = require('./models/user');
const mongoose = require('mongoose');

// create 

router.post('/user',async(req,res)=>{
    const user = new User(req.body);
    await user.save();
    res.status(201).send(user);
});

// read

router.get('/user', async(req,res)=>{
    const user = await User.find();
    res.send(user);
});

// update

router.put('/user/:id',async(req,res)=>{
    const user = await User.findByidAndUpdate(req.params.id, req.body, {new: true});
    res.send(user);
});

// delete

router.delete('usser/:id',async(req,res) =>{
    await User.findByIdAndDelete(req.params.id);
    res.send({message :'User Deleted'});
});

module.exports = router;