
import React, { useState} from 'react'

function BookCard(props){
    return(
        <div>
        <img src={props.imageSrc} alt="..." />
            <div className="centerText">
                <h5 className="bookcard-title">{props.title}</h5>
                <p className="bookcard-author">{props.author}</p>
                <p className="bookcard-blurb">{props.blurb}</p>
                <p className="bookcard-rating">{props.rating}</p>
                <p className="bookcard-genre">{props.genre}</p>
            </div>
        </div>
    )

}
export default BookCard
