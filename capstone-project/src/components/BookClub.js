import React from 'react';
import Navbar from './Navbar';
import './BookClub.css';
import bookoftheweek from '../resources/bookoftheweek.jpg';
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
                <div class = "description">
                <p> This month we're reading One Day by David Nicholls </p>
                <p> A beautiful tale revolving love and heartbreak </p> <hr/>
                </div>
                <p>Wanna be part of the live discussion?</p>
                <p> Join our zoom link:</p>
                <a href="http://"><button class="button">Click to join</button></a>
                <div class="zoomlinks">
                <p>Every Wednesdays from 7pm-8pm!</p> 
            </div>
            </div>
            
        </aside>
        <main class="page-main">
            <div class="content">
                <img src ={bookoftheweek} alt="books" class="responsive"/>
            </div>
        </main>
        <footer class="page-footer">
            <div class="content">
                <p class="booktitle">Book of the week!</p>
            </div>
         </footer>  
         </div>
    )
}

{/* <a= href="http://"><button class="button">Click to join</button></a> */}