import React from 'react';

const City = props => (
    <form onKeyPress={props.weatherMethod}>
        <div className="input">
            <input className="search" type='search' name="city" placeholder='Search location' />
        </div>
    </form>
);

export default City;
