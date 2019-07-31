import React from 'react';

const Weather = (props) => (

    <div>
        {props.city &&
        <div className="info">
            <div className="temp">
                <span className="value">{props.temp}&deg;</span>
            </div>
            <div className="hr"/>
            <div className="location">
                <span className="city">{props.city}</span>
                <span>{props.localtime}</span>
            </div>
        </div>
        }
    </div>

);

export default Weather;
