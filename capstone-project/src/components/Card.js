import React from 'react'
import './Card.css'
function Card(props) {
    return (
        <div class="card" styles="width: 18rem;">
        <img src={props.imageSrc} class="card-img-top" alt="..."/>
        <div class="card-body">
        <h4 class="card-footer">{props.footers}</h4>
        <p class="card-text">{props.text}</p>
  </div>
</div>
    )
}

export default Card


