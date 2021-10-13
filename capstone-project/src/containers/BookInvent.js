
import React from 'react'
import BookInventory from "../components/BookInventory"
import axios from 'axios';


class BookInvent extends React.Component{
  constructor (props){
    super(props);
    
    this.state = {
      books: []
    }

    this.getBooks = this.getBooks.bind(this);
  }
  

  componentDidMount() {
    this.getBooks();
  }

  getBooks(){
      axios.get(`http://localhost:8080/somethingBorrowed/book`)
        .then(res => {
          const books = res.data;
          this.setState({ books });
        })
  }

  render() {
      return (
          <div>
            <BookInventory books={this.state.books}/>
          </div>
      )
  }
}

export default BookInvent