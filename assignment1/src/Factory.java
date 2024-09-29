// Abstract class representing different types of coffee
abstract class Coffee {
    public abstract String getDescription();
}

// Concrete coffee classes
class Doppio extends Coffee {
    public String getDescription() {
        return "Doppio";
    }
}

class Americano extends Coffee {
    public String getDescription() {
        return "Americano";
    }
}

// Factory class that creates different coffee types
public class Factory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "doppio":
                return new Doppio();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}
