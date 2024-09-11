public class Car {

    // Instance variables for the Car class
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2020);
        
        // Print the model and year of the car
        System.out.println(myCar.model + " " + myCar.year);
    }
}

