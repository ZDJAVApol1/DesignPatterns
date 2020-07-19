package pl.sda.zdjavapol1.factorymethod.pizza;

public class WloskaPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("serowa")) {
            return new WloskaPizzaSerowa();
        } else {
            throw new IllegalArgumentException("Unknown pizza: " + type);
        }
    }
}
