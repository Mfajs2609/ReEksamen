package Observer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

// Uses the Subject interface to update all Observers

public class WeatherStation implements Subject {

    private ArrayList<Observer> observers;

    private int temp;



    public WeatherStation(){
        // Creates an ArrayList to hold all observers
        observers = new ArrayList<>();
    }

    public void register(Observer newObserver) {

        // Adds a new observer to the ArrayList
        observers.add(newObserver);

    }
    public void unregister (Observer deleteObserver) {

        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    //notifies observers of changes
    public void notifyObserver() {

        // Cycle through all observers and notifies them of changes
        for(Observer observer : observers){
            observer.update(temp);
        }

    }


        public void setTemp ( int temp){
            try {
                int currentTemp = 5;

                while (true) {

                    this.temp = currentTemp++;
                    notifyObserver();
                    TimeUnit.SECONDS.sleep(5);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
}
