package nl.capgemini.taguild.mobprogramming.objects;

public class PizzaObject {

    private double price;
    private String name;
    private double cost;

    public PizzaObject(final double price, final String name, final double cost) {
        this.price = price;
        this.name = name;
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(final double cost) {
        this.cost = cost;
    }



}
