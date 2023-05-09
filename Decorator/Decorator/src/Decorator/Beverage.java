package Decorator;

public abstract class Beverage {
    String description = "Unkown Beverage";
    String size = "tall";
    public String getDescription() {
        return description;
    }

    public abstract  double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
