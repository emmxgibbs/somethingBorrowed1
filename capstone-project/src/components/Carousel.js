import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";
import Card from './Card';
import mystic from '../resources/mystic.jpeg';
import passport from '../resources/passport.jpeg';
import sugarrun from '../resources/sugarrun.jpeg';
import thewatercure from '../resources/thewatercure.jpeg';



const responsive = {
  desktop: {
    breakpoint: { max: 3000, min: 1024 },
    items: 3,
    slidesToSlide: 3 // optional, default to 1.
  },
  tablet: {
    breakpoint: { max: 1024, min: 464 },
    items: 2,
    slidesToSlide: 2 // optional, default to 1.
  },
  mobile: {
    breakpoint: { max: 464, min: 0 },
    items: 1,
    slidesToSlide: 1 // optional, default to 1.
  }
};

export default function CarouselOne() {
    return(
<Carousel responsive={responsive}>
  <div className = "item1" align = "center"> 
        <Card imageSrc = {mystic} alt font-size="13p"
            text ="'Quote'"/>      
 </div>
 <div className = "item2" align = "center"> 
    <Card imageSrc = {passport} 
            text = "'Quote'"/>  
 </div>
 <div className = "item3" align = "center"> 
      <Card imageSrc = {sugarrun} 
            text = "'Quote'"/>  
 </div>
 <div className = "item4" align = "center"> 
    <Card imageSrc = {thewatercure} 
            text = "'Quote'"/>  
 </div>
</Carousel>
)}




