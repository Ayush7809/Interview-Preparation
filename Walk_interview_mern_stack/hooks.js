 

import React,{ useEffect, useState} from 'reactt';

function User(){
    const[user, setUser] = useState([]);

    useEffect(() => {
        fetch("http://localhost:5000/user")
        .then(res => res.json())
        .then(data => setUser(data))
    } , []);
   
    return(
        <div>
            {user.map(user => (
                <li key={user._id}>{user.name}</li>
            ))}
        </div>
    )
}
export default User;