import React, { useState} from 'react'

function BookCard(props){
    return(
        <div>
            <img src={props.imageLink} alt="..." />
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

{/* <div class="card mb-3" style="max-width: 540px;">
<div class="row g-0">
    <div class="col-md-4">
        <img src={props.imageLink} class="img-fluid rounded-start" alt="..." />
    </div>
    <div class="col-md-8">
        <div class="card-body">
            <h5 class="card-title">{props.title}</h5>
            <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
            <p className="card-author">{props.author}</p>
            <p className="card-blurb">{props.blurb}</p>
            <p className="card-genre">{props.genre}</p>
            <p class="card-rating"><small class="text-muted">{props.rating}</small></p>
        </div>
    </div>
</div>
</div> */}