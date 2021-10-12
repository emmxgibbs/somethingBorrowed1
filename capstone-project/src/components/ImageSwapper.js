import React, { useEffect, useState } from "react";
import './ImageSwapper.css';
import bookcover1 from '../resources/bookcover1.jpg';
import bookcover2 from '../resources/bookcover2.jpg';
import bookcover3 from '../resources/bookcover3.jpg';
import bookcover4 from '../resources/bookcover4.jpg';
import bookcover5 from '../resources/bookcover5.jpg';
import bookcover6 from '../resources/bookcover6.jpg';
import bookcover7 from '../resources/bookcover7.jpg';
import bookcover8 from '../resources/bookcover8.jpg';
import bookcover9 from '../resources/bookcover9.jpg';
import bookcover10 from '../resources/bookcover10.jpg';
import bookcover11 from '../resources/bookcover11.jpg';

const images = [bookcover1, bookcover2, bookcover3, bookcover4, bookcover5, 
    bookcover6, bookcover7, bookcover8, bookcover9, bookcover10, bookcover11];

export default function ImageSwapper() {
    const [currentImage, setCurrentImage] = useState(null);

    useEffect(() => {
        const intervalId = setInterval(() => {
            setCurrentImage(images[Math.floor(Math.random() * images.length)]);
        }, 2000)
        
        return () => clearInterval(intervalId);
    }, [])

    return (
        <div className = "image">
            <img src={currentImage} alt = "buying" width="1300" height="500"/>
        </div>
    )
}