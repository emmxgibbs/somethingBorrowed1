// import Carousel from "react-multi-carousel";
// import "react-multi-carousel/lib/styles.css";
// import reviewing from '../resources/reviewing.png';
// import Card from './Card';
// import somethinglong from '../resources/somethinglong.gif';
// import ladybug from '../resources/ladybug.jpeg';
// import muscle from '../resources/muscle.jpeg';
// import sugarrun from '../resources/sugarrun.jpeg';
// import thewatercure from '../resources/thewatercure.jpeg';



// const responsive = {
//   desktop: {
//     breakpoint: { max: 3000, min: 1024 },
//     items: 3,
//     slidesToSlide: 3 // optional, default to 1.
//   },
//   tablet: {
//     breakpoint: { max: 1024, min: 464 },
//     items: 2,
//     slidesToSlide: 2 // optional, default to 1.
//   },
//   mobile: {
//     breakpoint: { max: 464, min: 0 },
//     items: 1,
//     slidesToSlide: 1 // optional, default to 1.
//   }
// };

// export default function CarouselOne() {
//     return(
// <Carousel responsive={responsive}>
//   <div> ;
//       className = "item1" align = "center"{">"}
//         <Card 
//             footers = "ladybug"/>
//             <img class="item1" src = {ladybug} />
//  </div>
//  <div> 
//       className = "item2" align = "center"{">"}
//         <Card 
//             footers = "muscle"/>
//             <img class="item2" src = {muscle} />
//  </div>
//  <div> 
//       className = "item3" align = "center"{">"}
//         <Card 
//             footers = "sugarrun"/>
//             <img class="item3" src = {sugarrun} />
//  </div>
//  <div> 
//       className = "item4" align = "center"{">"}
//         <Card 
//             footers = "thewatercure"/>
//             <img class="item4" src = {thewatercure} />
//  </div>
// </Carousel>
// )}

import React, { useEffect, useState } from "react";
import './Carousel.css';
import buying from '../resources/buying.png';
import trading from '../resources/trading.png';
import reviewing from '../resources/reviewing.png';

const images = [buying, trading, reviewing];

export default function ImageSwapper() {
    const [currentImage, setCurrentImage] = useState(null);

    useEffect(() => {
        const intervalId = setInterval(() => {
            setCurrentImage(images[Math.floor(Math.random() * images.length)]);
        }, 3000)
        
        return () => clearInterval(intervalId);
    }, [])

    return (
        <div className = "image">
            <img src={currentImage} alt = "buying" />
        </div>
    )
}


