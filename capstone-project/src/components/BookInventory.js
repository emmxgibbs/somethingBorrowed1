
import React from 'react';
import Card from './Card';
import axios from 'axios';

export default class BookInventory extends React.Component {

  render() {
    return (
      <div className="container-fluid">
        <div className="row">
          {this.props.books.map(book =>
            <div className="col-sm-4" align="center">
              <BookCard title={book.title} author={book.author} blurb={book.blurb} rating={book.rating}
                genre={book.genre} />
            </div>)}
        </div>
      </div>
    )
  }
}
