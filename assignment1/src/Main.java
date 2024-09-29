public class Main {
    public static void main(String[] args) {
        // 1. Singleton
        Singleton shop = Singleton.getInstance();

        // 2. Factory Method
        Factory factory = new Factory();
        Coffee doppio = factory.createCoffee("doppio");
        Coffee americano = factory.createCoffee("americano");

        // 3. Abstract Factory
        CoffeeIngredientFactory ingredientFactory = new DoppioIngredientFactory();
        Milk milk = ingredientFactory.createMilk();
        Syrup syrup = ingredientFactory.createSyrup();
        System.out.println("Ingredients: " + milk.getType() + ", " + syrup.getFlavor());

        // 4. Prototype
        Prototype originalOrder = new Prototype(doppio); // Changed to use doppio
        Prototype clonedOrder = originalOrder.clone();
        System.out.println("Cloned Order: " + clonedOrder.getCoffee().getDescription());

        // 5. Builder
        Builder customCoffee = new Builder.CoffeeBuilder()
                .setSize("Large")
                .setMilk("Coconut Milk")
                .setSyrup("Caramel")
                .build();
        System.out.println(customCoffee);

        // Simulating the coffee shop processing orders
        shop.makeOrder(doppio);
        shop.makeOrder(americano);
    }
}
