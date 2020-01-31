package Observer;

public class WeatherObserver implements Observer{

    private int temp;

    // Static used as a counter
    private static int observerIDTracker = 0;

    // Used to track the observers
    private int observerID;

    // Will hold reference to the WeatherStation object
    private Subject weatherStation;

    public WeatherObserver(Subject weatherStation){

        // Store the reference to the weatherstation object so
        // I can make calls to its methods
        this.weatherStation = weatherStation;

        // Assign an observer ID and increment the static counter
        this.observerID = ++observerIDTracker;

        // Message of new Observer
        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList
        weatherStation.register(this);

    }

    public void update(int temp) {
        this.temp = temp;
        printToObservers();
    }

    public void printToObservers(){
        System.out.println("ObserverID: " + observerID + ", Temperatur: " + temp);
    }
}
