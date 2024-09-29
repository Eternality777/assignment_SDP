public class Builder {
    // Fields to hold the properties of the coffee
    private String size;
    private String milk;
    private String syrup;

    // Private constructor that takes a CoffeeBuilder object
    // This constructor is used to create an instance of Builder
    private Builder(CoffeeBuilder builder) {
        this.size = builder.size;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
    }

    // Static inner class for building the Custom Coffee
    public static class CoffeeBuilder {
        // Fields to hold the properties of the coffee
        private String size;
        private String milk;
        private String syrup;

        // Method to set the size of the coffee
        public CoffeeBuilder setSize(String size) {
            this.size = size;
            return this; // Return the builder instance for method chaining
        }

        // Method to set the type of milk for the coffee
        public CoffeeBuilder setMilk(String milk) {
            this.milk = milk;
            return this; // Return the builder instance for method chaining
        }

        // Method to set the syrup for the coffee
        public CoffeeBuilder setSyrup(String syrup) {
            this.syrup = syrup;
            return this; // Return the builder instance for method chaining
        }

        // Method to create a new Builder instance using the CoffeeBuilder settings
        public Builder build() {
            return new Builder(this); // Call the private constructor of Builder
        }
    }

    // Override the toString method to provide a string representation of the Custom Coffee
    @Override
    public String toString() {
        return "Custom Coffee: size = " + size + ", milk = " + milk + ", syrup = " + syrup;
    }
}
