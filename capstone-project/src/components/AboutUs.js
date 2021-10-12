import React from 'react';
import Navbar from './Navbar';
import './AboutUs.css';
// import { Link } from "react-router-dom";



export default function AboutUs() {
  return(
    <div className = "aboutus-container">
    <Navbar/>
    <section>
        <div className = "aboutus-background"> 
        <div className = "aboutus-header">
        <h2> this is our story... </h2> 
        </div>   
        <div className = "aboutus-gap">
            <h4> . </h4>
        </div>      
        <div className = "aboutus-paragraph">
            <h4> We are a team of avid readers wanting to get the world in love with books again! </h4>
        </div>  
       </div> 
    </section>  
  </div>    
                 
  )
  }