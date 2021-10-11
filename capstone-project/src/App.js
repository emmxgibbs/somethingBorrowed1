import './App.css';
import Navbar from './components/Navbar.js';
import Homepage from './components/Homepage.js';

function App() {
  return (
    <div className="App">
      <Homepage/>
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
