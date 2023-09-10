import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Chesse cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagona slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name) {
        this.name = name
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
