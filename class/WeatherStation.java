public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ForecastDisplay2 forecastDisplay2 = new ForecastDisplay2(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.9f);
        weatherData.setMeasurements(78, 90, 29.9f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(40, 30, 40.9f);

    }
}