import React from 'react';
import Card from './Card';
import Navbar from './Navbar';
import buying from '../resources/buying.png';
import trading from '../resources/trading.png';
import reviewing from '../resources/reviewing.png';
import './Homepage.css';
import CarouselOne from './Carousel';

export default function Homepage() {
  return(
      <div className = "homepage-container">
          <Navbar/>
          <section>
              <div className = "background">
              <div className = "quotes">
                  <img src = {buying} alt = "Image of a book" className = "quotes-image" />
                  <p className = "book-quote"> Quote of the day...</p>
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
                <CarouselOne/>
              </div>
              </div>
          </section>  
      </div>    
                       
  )
  }
