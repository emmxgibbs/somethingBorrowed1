import React from 'react';
import { Link } from "react-router-dom";

import "bootstrap/dist/css/bootstrap.min.css";

function Navbar() {
    return (
        <nav id="navbar" class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Something borrowed, something read</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">About Me</a>
              </li>
              <li class="nav-item">
                <Link class="nav-link" to ="./">About Me</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    )
}

export default Navbar

