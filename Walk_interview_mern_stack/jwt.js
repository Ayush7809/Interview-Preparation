 

const jwt  = require('jsonwebtoken');


const verifyToken = (req, res, next) => {
    const token = req.headers['authorization'];
    if (!token) {
        return res.status(401).send('Access denied. No token provided.');
    }
    try{
        const varify = jwt.verify(token, process.env.jwt_secret);
        req.user = varify;
        next();
    }
    catch(err){
        return res.status(400).send('Invalid token.');
    }
};

modules.exports = verifyToken;
