import './App.css';
import Homepage from './components/Homepage';
import Books from './components/Books';
import BookClub from './components/BookClub';
import AboutUs from './components/AboutUs';
import ContactUs from './components/ContactUs';
import Reviews from './components/Reviews';
import { Route, Switch } from 'react-router-dom';

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
    </Switch>

    </div>
  );
}

export default App;

// import { Route, Switch } from 'react-router-dom';

// function App() {
//   return (
//     <div className="App">
//       <Switch>
//         <Route exact path="/" component={Homepage} />
//         <Route path="/books" component={Books} />
//         <Route path="/bookclub" component={Bookclub} />
//         <Route path="/reviews" component={Reviews} />
//         <Route path="/aboutus" component={AboutUs} />
//         <Route path="/contactusus" component={ContactUs} />
//         <Route path="/register" component={Register} />
//         <Route path="/signin" component={SignIn} />
//         <Route component={Error} />
//       </Switch>
//     </div>
//   );
// }

// export default App;
