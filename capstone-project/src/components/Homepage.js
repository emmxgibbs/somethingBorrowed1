import React from 'react';
import buying from './resources/buying.png';
import trading from './resources/trading.png';
import reviewing from './resources/reviewing.png';
// import Carousel from 'react-multi-carousel';
// import 'react-multi-carousel/lib/styles.css';

export default function Homepage() {
    return(
        <div className = "homepage-container">
            <section>
                <div className = "background">
                <div className = "quotes">
                    <img src = {} alt = "Image of a book" className = "quotes-image" />
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
                <div className = "fave-books">    </div>
                </div>
            </section>  
        </div>    
                         
    )

    // Carousel feature
const responsive = {
    desktop: {
        breakpoint: { max: 3000, min: 1024 },
        items: 3,
        partialVisibilityGutter: 40 // this is needed to tell the amount of px that should be visible.
      },
      tablet: {
        breakpoint: { max: 1024, min: 464 },
        items: 2,
        partialVisibilityGutter: 30 // this is needed to tell the amount of px that should be visible.
      },
      mobile: {
        breakpoint: { max: 464, min: 0 },
        items: 1,
        partialVisibilityGutter: 30 // this is needed to tell the amount of px that should be visible.
      }
    };
{/* <Carousel partialVisible={true} responsive={responsive}>
  <ItemOne />
  <ItemTwo />
</Carousel> */}

{/* <Carousel
  swipeable={false}
  draggable={false}
  showDots={true}
  responsive={responsive}
  ssr={true} // means to render carousel on server-side.
  infinite={true}
  autoPlay={this.props.deviceType !== "mobile" ? true : false}
  autoPlaySpeed={1000}
  keyBoardControl={true}
  customTransition="all .5"
  transitionDuration={500}
  containerClass="carousel-container"
  removeArrowOnDeviceType={["tablet", "mobile"]}
  deviceType={this.props.deviceType}
  dotListClass="custom-dot-list-style"
  itemClass="carousel-item-padding-40-px"
>
  <div>Item 1</div>
  <div>Item 2</div>
  <div>Item 3</div>
  <div>Item 4</div>
</Carousel>; */}

  // end of Carousel feature

}

