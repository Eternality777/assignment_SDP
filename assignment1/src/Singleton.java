public class Singleton {
    // Static variable to hold the single instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Private constructor
    }

    // Public method to provide access to the single instance of the class
    public static Singleton getInstance() {
        // Check if the instance is null, indicating it hasn't been created yet
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it does not exist
        }
        return instance; // Return the single instance
    }

    // Method to simulate making a coffee order
    public void makeOrder(Coffee coffee) {
        // Print out a message indicating the order is being prepared
        System.out.println("Order is being prepared: " + coffee.getDescription());
    }
}
