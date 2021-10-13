import React from "react";
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from "mdbreact";
import somethinglong from '../resources/somethinglong.gif';
import { Link } from "react-router-dom";

const Footer = () => {
  return (
    <MDBFooter color="unique-color-dark" className="font-small pt-4 mt-4">
      <MDBContainer className="text-center text-md-left">
        <MDBRow className="text-center text-md-left mt-3 pb-3">
          <MDBCol md="3" lg="3" xl="4" className="mx-auto mt-3">
            <h6 className="text-uppercase mb-4 font-weight-bold">
            <img src={somethinglong} alt="Book Store App" height="50px" />              
            </h6>
            <p>
            Something read something borrowed is an online book club where the customer can buy, trade, borrow books online.
             Through this book club, readers can connect with other enthusiatic reader to increase excitement around books.
            </p>
          </MDBCol>
          <hr className="w-100 clearfix d-md-none" />
          <MDBCol md="2" lg="2" xl="2" className="mx-auto mt-3">
            <h6 className="text-uppercase mb-4 font-weight-bold"><strong>Services</strong></h6>
            <p>
              <Link to ="./bookclub" >Book Club</Link>
            </p>
            <p>
              <Link to ="./contact" >Contact Us</Link>
            </p>
            <p>
              <Link to ="./about" >About Us</Link>
            </p>
          </MDBCol>

          <hr className="w-100 clearfix d-md-none" />
          <MDBCol md="4" lg="3" xl="3" className="mx-auto mt-3">
            <h6 className="text-uppercase mb-4 font-weight-bold"><strong>Contact</strong></h6>
            <p>
              <i className="fa fa-envelope mr-3" /> somethingbr@gmail.com
            </p>
            <p>
              <i className="fa fa-phone mr-3" /> +44(0)6377518516
            </p>
            <p>
              <i className="fa fa-home mr-3" /> London, United Kingdom
            </p>
          </MDBCol>
        </MDBRow>
        <hr />
        <MDBRow className="d-flex align-items-center">
          <MDBCol md="8" lg="8">
            <p className="text-center text-md-left grey-text">
              &copy; {new Date().getFullYear()} Made by
              <a href=""> Somethingbr </a>
            </p>
          </MDBCol>
          <MDBCol md="4" lg="4" className="ml-lg-0">
            <div className="text-center text-md-right">
              <ul className="list-unstyled list-inline">
              <li className="list-inline-item">
                  <a className="btn-floating btn-sm rgba-white-slight mx-1" href="http://github.com/Somethingborrowed1">
                    <i className="fab fa-github" />
                  </a>
                </li>
                <li className="list-inline-item">
                  <a className="btn-floating btn-sm rgba-white-slight mx-1" href='https://www.linkedin.com/in/Somethingbr/'>
                    <i className="fab fa-linkedin-in" />
                  </a>
                </li>
                <li className="list-inline-item">
                  <a className="btn-floating btn-sm rgba-white-slight mx-1" href='https://www.facebook.com/Somethingbr/'>
                    <i className="fab fa-facebook-f" />
                  </a>
                </li>
                <li className="list-inline-item">
                  <a className="btn-floating btn-sm rgba-white-slight mx-1" href='https://www.instagram.com/Somethingbr/'>
                    <i className="fab fa-instagram" />
                  </a>
                </li>
              </ul>
            </div>
          </MDBCol>
        </MDBRow>
      </MDBContainer>
    </MDBFooter>
  );
}

export default Footer;