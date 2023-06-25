import React, { useState } from 'react';

const BookFlight = () => {
  const [from, setFrom] = useState('');
  const [to, setTo] = useState('');
  const [date, setDate] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Handle form submission logic here
    // You can access the field values using the state variables: from, to, date
    console.log('Form submitted:', from, to, date);
  };

  return (
    <div className='container'>
    <br />
    <br />
    <br />

      <h2>Book Flights</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ display: 'flex', justifyContent: 'center' }}>
          <div>
            <label htmlFor="from">From:</label>
            <input
              type="text"
              id="from"
              value={from}
              onChange={(e) => setFrom(e.target.value)}
            />
          </div>
          <div>
            <label htmlFor="to">To:</label>
            <input
              type="text"
              id="to"
              value={to}
              onChange={(e) => setTo(e.target.value)}
            />
          </div>
          <div>
            <label htmlFor="date">Date:</label>
            <input
              type="date"
              id="date"
              value={date}
              onChange={(e) => setDate(e.target.value)}
            />
          </div>
        </div>
        <div style={{ display: 'flex', justifyContent: 'center', marginTop: '1rem' }}>
          <button className='btn btn-success' type="submit">Book Now</button>
        </div>
      </form>
    </div>
  );
};

export default BookFlight;
