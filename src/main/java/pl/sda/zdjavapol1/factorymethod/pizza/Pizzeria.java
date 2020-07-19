package pl.sda.zdjavapol1.factorymethod.pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
