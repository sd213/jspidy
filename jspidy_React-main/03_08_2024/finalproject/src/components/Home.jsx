import React from 'react'
import pics from '../Images/Image';
function Home() {
  return (
    <div className="home">
      <div class="hmheading">
        <h1>Welcome to [Library Name]</h1>
        <p>Discover a world of knowledge and adventure.</p>
      </div>

      <div className="container">
        <img src={`${pics[9].image}`} alt="" />
        <div class="section categories">
          <h2>Featured Categories</h2>
          <ul>
            <li>
              <strong>Fiction:</strong> Get lost in imaginative tales.
            </li>
            <li>
              <strong>Non-Fiction:</strong> Expand your knowledge with
              real-world insights.
            </li>
            <li>
              <strong>Children’s Books:</strong> Fun reads for the young and
              young at heart.
            </li>
            <li>
              <strong>Science & Technology:</strong> Stay ahead with the latest
              advancements.
            </li>
            <li>
              <strong>History:</strong> Delve into the past and discover
              historical events and figures.
            </li>
          </ul>
        </div>
      </div>
      <div className="container">
        <div class="section testimonials">
          <h2>User Testimonials</h2>
          <ul>
            <li>
              <em>
                “This library has an amazing collection! I find everything I
                need.”
              </em>{" "}
              - Alice B.
            </li>
            <li>
              <em>
                “Great place to find children’s books and educational material.”
              </em>{" "}
              - Mark L.
            </li>
            <li>
              <em>
                “The staff is incredibly helpful and the online catalog is very
                easy to use.”
              </em>{" "}
              - Sarah K.
            </li>
          </ul>
        </div>
        <img src={`${pics[3].image}`} alt="" />
      </div>
      <div className="container">
        <img src={`${pics[4].image}`} alt="" />
        <div class="section featured-authors">
          <h2>Featured Authors</h2>
          <ul>
            <li>
              <strong>J.K. Rowling:</strong> Author of the Harry Potter series,
              her magical world has captivated readers of all ages.
            </li>
            <li>
              <strong>Stephen King:</strong> The master of horror fiction, known
              for his thrilling and suspenseful novels.
            </li>
            <li>
              <strong>Chimamanda Ngozi Adichie:</strong> A celebrated Nigerian
              author known for her insightful works on feminism and identity.
            </li>
            <li>
              <strong>George Orwell:</strong> Renowned for his dystopian novels,
              including "1984" and "Animal Farm".
            </li>
          </ul>
        </div>
      </div>
      <div className="container">
        <div class="section events">
          <h2>Upcoming Events</h2>
          <ul>
            <li>
              <strong>Book Reading with [Author Name]</strong> - August 20,
              2024: Join us for an evening of storytelling and discussion.
            </li>
            <li>
              <strong>Children’s Storytime</strong> - Every Saturday at 10:00
              AM: Fun and engaging story sessions for kids aged 3-7.
            </li>
            <li>
              <strong>Writing Workshop</strong> - September 10, 2024: Improve
              your writing skills with guidance from experienced authors.
            </li>
            <li>
              <strong>Library Book Sale</strong> - September 15-17, 2024: Browse
              and buy a wide selection of books at discounted prices.
            </li>
          </ul>
        </div>
        <img src={`${pics[8].image}`} alt="" />
      </div>
    </div>
    // </div>
  );
}

export default Home