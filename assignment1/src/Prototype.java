public class Prototype implements Cloneable {
    // Field to hold the Coffee object that this Prototype is associated with
    private Coffee coffee;

    // Constructor that initializes the Prototype with a Coffee object
    public Prototype(Coffee coffee) {
        this.coffee = coffee;
    }

    // Method to clone the current Prototype instance
    @Override
    public Prototype clone() {
        try {
            // Call super.clone() to create a shallow copy of the Prototype
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            // This exception should never occur since we implement Cloneable
            throw new AssertionError();
        }
    }

    // Method to retrieve the Coffee object associated with this Prototype
    public Coffee getCoffee() {
        return coffee;
    }
}
