import React from 'react';
import Navbar from './Navbar';
import './AboutUs.css';
import buying from '../resources/buying.png';
import { Link } from "react-router-dom";



export default function AboutUs() {
  return(
  <div class="grid">
          <Navbar/>
        <header class="page-header">
            <div class="content">
                <h1>About Us</h1>
            </div>
        </header>
        <aside class="page-rightbar">
            <div class="content">
                <p>Facts</p>
            </div>
        </aside>
        <main class="page-main">
            <div class="content">
                <img src ={buying} alt="books" class="responsive"/>
            </div>
        </main>
        <footer class="page-footer">
            <div class="content">
                <h3>Thank you! <Link to="/register"><button class="">Sign In / Register</button></Link> </h3>
            </div>
         </footer>  
         </div> 
    )
}
