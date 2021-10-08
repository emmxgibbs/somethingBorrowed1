import React from 'react';

// function Navbar() {
//     return (
//         <><button class="btn btn-primary" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">Toggle right offcanvas</button><div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
//             <div class="offcanvas-header">
//                 <h5 id="offcanvasRightLabel">Offcanvas right</h5>
//                 <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
//             </div>
//             <div class="offcanvas-body">
//                 Text here
//             </div>
//         </div><div class="dropdown mt-3">
//                 <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown">
//                     Dropdown button
//                 </button>
//                 <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
//                     <li><a class="dropdown-item" href="#">Action</a></li>
//                     <li><a class="dropdown-item" href="#">Another action</a></li>
//                     <li><a class="dropdown-item" href="#">Something else here</a></li>
//                 </ul>
//             </div></>
//     )}

// export default Navbar


import "bootstrap/dist/css/bootstrap.min.css";

function Navbar() {
    return (
        <nav id="navbar" class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="www.google.com">Farheen Rahim</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="www.google.com">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#aboutme">About Me</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    )
}

export default Navbar
    