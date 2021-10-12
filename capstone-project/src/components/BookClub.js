import React from 'react';
import Navbar from './Navbar';
import './BookClub.css';
import aboutuspic from '../resources/aboutuspic.jpeg';
import { Link } from "react-router-dom";



export default function BookClub() {
  return(
  <div class="grid">
          <Navbar/>
          
        <header class="page-header">
            <div class="content">
                <h1>Join the book club!</h1>
            </div>
        </header>
        <aside class="page-rightbar">
            <div class="content">
                <p>Facts</p>
            </div>
        </aside>
        <main class="page-main">
            <div class="content">
                <img src ={aboutuspic} alt="books" class="responsive"/>
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