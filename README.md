# Design Patterns (Lab 3): Observer-Pattern Design

## Questions

1. Implement the weather monitoring application using the observer design pattern.
2. Add another forecast display as observer for weatherData. Compile and run your proggram.
3. Write the statements in WeatherStation.java to unsubscribe forecastDisplay as observer of weatherData. Compile and run.
4. What happen if you remove this statement (`private Subject weatherData`) from from `CurrentConditionDisplay` and remove this statement (`this.weatherData = weatherData;`)  from `CurrentConditionDisplay` constructor?
5. Create a duplicate copy of your current project and use that as the basis to work on Lab 3.