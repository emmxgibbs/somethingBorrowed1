import './App.css';
import Homepage from './components/Homepage';
import Books from './components/Books';
import BookClub from './components/BookClub';
import AboutUs from './components/AboutUs';
import ContactUs from './components/ContactUs';
import Reviews from './components/Reviews';
import SearchBar from './components/SearchBar';
import { Route, Switch } from 'react-router-dom';
// import '@fortawesome/fontawesome-free/css/all.min.css';
import 'bootstrap-css-only/css/bootstrap.min.css';
// import 'mdbreact/dist/css/mdb.css';

function App() {
  return (
    <div className="App">
      <Switch>
         <Route exact path="/" component={Homepage} />
         <Route path="/about" component={AboutUs} />
         <Route path="/contact" component={ContactUs} />
         <Route path="/reviews" component={Reviews} />
         <Route path="/books" component={Books} />
         <Route path="/bookclub" component={BookClub} />
         <Route path="/searchbar" component={SearchBar} />
    </Switch>

    </div>
  );
}

export default App;