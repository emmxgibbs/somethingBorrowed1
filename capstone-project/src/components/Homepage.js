import React from 'react';
import Card from './Card';
import ImageSwapper from './Carousel';
import Navbar from './Navbar';
import buying from '../resources/buying.png';
import trading from '../resources/trading.png';
import reviewing from '../resources/reviewing.png';
import './Homepage.css';
import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";


export default function Homepage() {
  return(
      <div className = "homepage-container">
          <Navbar/>
          <section>
              <div className = "background">
              <div className  = "bookimage" >
              <ImageSwapper/>
              </div>        
              <div className = "services">
                  <h3> Services </h3>
                  <div className = "row">
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {buying} 
                          footers = "You can buy and borrow books from us!" />
                      </div>
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {reviewing} 
                          footers = "You can join an online book club and review books together!"/>
                      </div>
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {trading} 
                          footers = "You can trade books with others!"/>
                      </div>
                  </div>
              </div>  
              <div className = "fave-books">
              </div>
              </div>
          </section>  
      </div>    
                       
  )
  }
