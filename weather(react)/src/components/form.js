import React from 'react';

const Form=props=>(
    <form onSubmit={props.weatherMethod}>
        <div className="input">
            <input className="search" type='search' name="city" placeholder='Search location' />
        </div>
    </form>
);

export default Form;
