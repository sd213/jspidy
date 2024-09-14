import React from 'react'

function Footer() {
  return (
    <div className="footer">
      <div className="footer-container">
        <div className="footer-section">
          <div className="footer-section-child">
            <h3>About Us</h3>
            <p>
              Learn more about our mission, values, and the team behind [Library
              Name].
            </p>
            <a href="#">Read More</a>
          </div>
          <div className="footer-section-child">
            <h3>Quick Links</h3>
            <ul>
              <li>
                <a href="#">Home</a>
              </li>
              <li>
                <a href="#">About</a>
              </li>
              <li>
                <a href="#">Books</a>
              </li>
              <li>
                <a href="#">Contact Us</a>
              </li>
            </ul>
          </div>
        </div>
        <div className="footer-section">
          <div className="footer-section-child">
            <h3>Contact Us</h3>
            <p>Email: contact@library.com</p>
            <p>Phone: +1 234 567 890</p>
            <p>Address: 123 Library St., City, Country</p>
          </div>
          <div className="footer-section-child">
            <h3>Follow Us</h3>
            <a href="#">Facebook</a> | <a href="#">Twitter</a> |{" "}
            <a href="#">Instagram</a>
          </div>
        </div>
      </div>
      <div className="footer-bottom">
        <p>&copy; 2024 [Library Name]. All rights reserved.</p>
      </div>
    </div>
  );
}

export default Footer