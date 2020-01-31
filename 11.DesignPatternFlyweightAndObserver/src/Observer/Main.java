package Observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver observer1 = new WeatherObserver(weatherStation);
        WeatherObserver observer2 = new WeatherObserver(weatherStation);

        weatherStation.setTemp(7);
    }
}
