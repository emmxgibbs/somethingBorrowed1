import React from 'react'
import './SignIn.css'
import { Link } from "react-router-dom";
import Navbar from './Navbar';


export default function SignIn(){
    return(
        // <div className = "signin-container">
        //   <Navbar/>
        <form className="form-background">
        <Navbar/>
            <div className="form-container">
                <h1> Sign in now! </h1>
                <div className="form-label">
                <label>
                    Username: 
                    <input type="text" name="username" /> 
                </label>
                <label>
                    Password: 
                    <input type="password" name="password" /> 
                </label> 
                </div> 
                <input className= "form-submit" type="submit" value="Submit" />
                <div className="form-Register"><h6><Link to="./register">Don't have an account? Register now</Link></h6></div>
                </div>
                </form>
                // </div>
                    )
                }