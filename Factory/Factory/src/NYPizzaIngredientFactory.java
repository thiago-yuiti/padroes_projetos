public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dought createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Chesse createCheese() {
        return ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return FreshClam();
    }
}
