import React from 'react';
import Card from './Card';
import Navbar from './Navbar';
import buying from '../resources/buying.png';
import trading from '../resources/trading.png';
import reviewing from '../resources/reviewing.png';
import './Homepage.css';
import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";
import CarouselOne from './Carousel';
import ImageSwapper from './ImageSwapper';
import Footer from './Footer';



export default function Homepage() {
  return(
      <div className = "homepage-container">
          <Navbar/>
          <section>
              <div className = "background">
              <div className = "header">
              <h2> Get started on your reading adventure today... </h2> 
              </div>
              <div className  = "bookimage" >
              <ImageSwapper/>    
              </div>        
              <div className = "services">
                  <h2> Services we offer: </h2>
                  <div className = "row">
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {buying} 
                          text = "You can buy and borrow books from us!" />
                      </div>
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {reviewing} 
                          text = "Join an online book club and review books!"/>
                      </div>
                      <div className = "col-sm-4" align = "center">
                          <Card imageSrc = {trading} 
                          text = "You can trade books with others!"/>
                      </div>
                  </div>
              </div>  
              <div className = "carousel-heading">
              <h2> Check out our great list of books: </h2> 
              </div>
              <div className = "Carousel">
                  <CarouselOne/>
              </div>
              </div>
              <div className = "footer">
                  <Footer/>
              </div>
          </section>  
      </div>    
                       
  )
  }
