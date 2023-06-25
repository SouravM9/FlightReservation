import React from 'react'

function Home() {
  return (
    <div className=''>

      <div style={{ position: 'relative', width: '100vw', height: '100vh', overflow: 'hidden' }}>
        <div style={{ position: 'absolute', left: '20%', top: '50%', transform: 'translate(-50%, -50%)', textAlign: 'center', color: 'white' }}>
          <h2>Welcome</h2>
          <h3>to</h3>
          <h1>Flight Reservation System</h1>
        </div>
        <img
          src='https://wallpaperset.com/w/full/c/9/7/183268.jpg'
          alt='plane'
          style={{ width: '100%', height: '100%', objectFit: 'cover' }}
        />
      </div>

    </div>
  )
}

export default Home