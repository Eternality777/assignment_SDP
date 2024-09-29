// Interfaces for ingredients
interface Milk {
    String getType();
}

interface Syrup {
    String getFlavor();
}

// Concrete ingredients for the factory
class SoyMilk implements Milk {
    public String getType() {
        return "Soy Milk";
    }
}

class VanillaSyrup implements Syrup {
    public String getFlavor() {
        return "Vanilla Syrup";
    }
}

// Abstract factory interface
interface CoffeeIngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

// Concrete factory for Doppio ingredients
class DoppioIngredientFactory implements CoffeeIngredientFactory {
    public Milk createMilk() {
        return new SoyMilk();
    }

    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

// Concrete factory for Americano ingredients (if needed)
class AmericanoIngredientFactory implements CoffeeIngredientFactory {
    public Milk createMilk() {
        return new SoyMilk();  // Example milk type, you can customize this
    }

    public Syrup createSyrup() {
        return new VanillaSyrup();  // Example syrup
    }
}
