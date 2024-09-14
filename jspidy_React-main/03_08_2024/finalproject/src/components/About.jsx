import React from 'react'

import pics from "../Images/Image";
function About() {
  return (
    <div className="about">
      <div className="section1">
        <div className="container1">
          <div className="description1">
            <h1>About [Library Name]</h1>
            <p>Your go-to destination for books, knowledge, and learning.</p>
          </div>
          <img src={`${pics[1].image}`} alt="" />
        </div>
      </div>
      <div className="section2">
        <div className="container1">
          <img src={`${pics[5].image}`} alt="" />
          <div className="description1">
            <h1>Our History</h1>
            <p>
              Founded in [Year], [Library Name] has been serving the community
              for over [Number] years. We started with just a small collection
              of books, and today, we offer thousands of titles across various
              genres and formats.
            </p>
          </div>
        </div>
      </div>
      <div className="section3">
        <div className="container1">
          <div className="description1">
            <h1>Meet Our Team</h1>
            <p>
              <strong>[Name]</strong> - <em>Library Director</em>: With over
              [Number] years of experience, [Name] leads our team with a passion
              for literacy and education.
              <br></br>
              <br></br>
              <strong>[Name]</strong> - <em>Children’s Librarian</em>:
              Specializing in children’s literature, [Name] is dedicated to
              fostering a love of reading in young minds.
            </p>
          </div>
          <img src={`${pics[13].image}`} alt="" />
        </div>
      </div>
      <div className="section1">
        <div className="container2">
          <h1>Community Programs</h1>
          <p>We offer a variety of programs including:</p>
          <ul>
            <li>
              Reading Clubs: Join fellow book lovers for engaging discussions.
            </li>
            <li>Workshops: Learn new skills with our expert-led workshops.</li>
            <li>
              Author Talks: Meet your favorite authors and hear their stories.
            </li>
          </ul>
          <div className="hr"></div>
        </div>
      </div>
      <div className="section1"></div>
    </div>
  );
}

export default About