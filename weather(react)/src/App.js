//Основной компонент,компанирует все элементы
import React from 'react';
import Info from './components/info'
import Form from './components/form'
import Weather from './components/weather'

const API_KEY = "8c96a8adac5447629eb203740191507";

class App extends React.Component {

    state = {
        temp: undefined,
        city: undefined,
        country: undefined,
        error: undefined,
        localtime:undefined,
        imageUrl: 'https://cdn.dribbble.com/users/658839/screenshots/2015006/city-illustration.png'
    };

    gettingWeather = async (e) => {
        e.preventDefault();
        const city = e.target.elements.city.value;

        if (city) {
            const api_url = await
                fetch(`https://api.apixu.com/v1/forecast.json?key=${API_KEY}&q=${city}&days=1`);

            const data = await api_url.json();
            this.setState({
                temp: data.current.temp_c,
                city: data.location.name,
                country: data.location.country,
                localtime:data.location.localtime,
                error: "",
                imageUrl: 'https://cdn.dribbble.com/users/658839/screenshots/2015006/city-illustration.png'
            });
        } else {
            this.setState({
                temp: undefined,
                city: undefined,
                country: undefined,
                error: "Введите название города",
                localtime:undefined,
                imageUrl: 'https://cdn.dribbble.com/users/658839/screenshots/2015006/city-illustration.png'
            })
        }
    };

    render() {
        return (
            <div>
                <Info />
                <div className="container">
                    <div className="image" >
                    </div>
                    <Weather
                        temp={this.state.temp}
                        city={this.state.city}
                        country={this.state.country}
                        localtime={this.state.localtime}
                        error={this.state.error}
                        image={this.state.imageUrl}
                    />
                </div>
                <Form weatherMethod={this.gettingWeather}/>
            </div>

        );
    }
}

//экспортируем для подключения
export default App;
