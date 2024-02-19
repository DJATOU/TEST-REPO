// Define a class named "Car"
public class Car {
    // Class attribute
    private int numWheels = 4;

    // Instance attributes
    private String make;
    private String model;
    private int year;
    private boolean isRunning;

    // Constructor method
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    // Method to start the car
    public void start() {
        if (!isRunning) {
            System.out.println("Starting the car...");
            isRunning = true;
        } else {
            System.out.println("The car is already running!");
        }
    }

    // Method to stop the car
    public void stop() {
        if (isRunning) {
            System.out.println("Stopping the car...");
            isRunning = false;
        } else {
            System.out.println("The car is already stopped!");
        }
    }

    // Getter method for numWheels
    public int getNumWheels() {
        return numWheels;
    }
}
// Getter methods for make, model, and
