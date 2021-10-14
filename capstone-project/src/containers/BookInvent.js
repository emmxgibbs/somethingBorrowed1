import React from 'react'
import BookInventory from '../components/BookInventory';
import axios from 'axios';


class BookInvent extends React.Component{
  constructor (props){
    super(props);
    
    this.state = {
      books: [],
      horrorBooks: [],
      classicBooks: []
    }

    this.getBooks = this.getBooks.bind(this);
    this.getHorror = this.getHorror.bind(this);
    this.getClassics = this.getClassics.bind(this);
  }
  

  componentDidMount() {
    this.getBooks();
    this.getHorror();
    this.getClassics();
  }

  getBooks(){
      axios.get(`http://localhost:8080/somethingBorrowed/book`)
        .then(res => {
          const books = res.data;
          this.setState({ books });
        })
  }
  getHorror(){
      axios.get(`http://localhost:8080/somethingBorrowed/book/filterGenre/horror`)
      .then(res => {
          const horrorBooks = res.data;
          this.setState({ horrorBooks });
      })
  }
  getClassics(){
    axios.get(`http://localhost:8080/somethingBorrowed/book/filterGenre/classic`)
    .then(res => {
        const classicBooks = res.data;
        this.setState({ classicBooks });
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