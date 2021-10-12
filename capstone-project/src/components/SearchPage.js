import React, { useState, useEffect } from 'react';
import SearchBar from './SearchBar.js';
import BookList from './BookList';

const SearchPage = (props) => {
  const [input, setInput] = useState('');
  const [bookListDefault, setBookListDefault] = useState();
  const [bookList, setBookList] = useState();

  const fetchData = async () => {
    return await fetch('https://restcountries.eu/rest/v2/all')
      .then(response => response.json())
      .then(data => {
         setBookList(data) 
         setBookListDefault(data)
       });}

  const updateInput = async (input) => {
     const filtered = bookListDefault.filter(book => {
      return book.name.toLowerCase().includes(input.toLowerCase())
     })
     setInput(input);
     setBookList(filtered);
  }

  useEffect( () => {fetchData()},[]);
	
  return (
    <>
      {/* <h1>Book List</h1> */}
      <SearchBar 
       input={input} 
       onChange={updateInput}
      />
      <BookList bookList={bookList}/>
    </>
   );
}
// const SearchPage = () => {
//     return (
//       <MDBCol md="6">
//         <div className="active-pink-3 active-pink-4 mb-4">
//           <input className="form-control" type="text" placeholder="Search" aria-label="Search" />
//         </div>
//       </MDBCol>
//     );
//   }

export default SearchPage

//api controller links to genre filter backend to search book by title
