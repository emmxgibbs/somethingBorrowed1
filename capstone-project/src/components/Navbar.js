import React from 'react';
import { Link } from "react-router-dom";
// import somethingsmall from '../resources/somethingsmall.gif';
import somethinglong from '../resources/somethinglong.gif';
import './Navbar.css';
// import somethingbr from '../resources/somethingbr.png';

import "bootstrap/dist/css/bootstrap.min.css";

function Navbar() {
    return (
        <nav id="navbar" class="navbar navbar-expand-lg navbar-light fixed-top"> 
        <div class="container-fluid">     
          <img class="navbar-brand" src = {somethinglong} />
          {/* <img class="navbar-brand" src={somethingbr}/> */}
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./" >Books</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./">Book Club</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./">Reviews</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./">About Us</Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./">Contact Us</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    )
}

export default Navbar

