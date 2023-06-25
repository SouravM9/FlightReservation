import './App.css';
import Navbar from './components/Navbar';
import Register from './components/Register';
import Login from './components/Login';
import Home from './components/Home';
import ForgotPassword from './components/ForgotPassword';
import {
  BrowserRouter as Router,
  Route,
  Routes
} from "react-router-dom";
import BookFlight from './components/BookFlight';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />

        <Routes>
          
        <Route exact path="/" element={
            <Home key="home" />}>
          </Route>

          <Route exact path="/register" element={
            <Register key="register" />}>
          </Route>

          <Route exact path="/login" element={
            <Login key="login" />}>
          </Route>

          <Route exact path="/forgotpassword" element={
            <ForgotPassword key="forgotpassword" />}>
          </Route>

          <Route exact path="/booking" element={
            <BookFlight key="booking" />}>
          </Route>

        </Routes>

      </Router>
    </div>
  );
}

export default App;
