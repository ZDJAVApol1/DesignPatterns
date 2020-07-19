package pl.sda.zdjavapol1.factorymethod;

public class FactoryMethodApp {

    public static void main(String[] args) {
        CarManufacture manufacture = new EuropeanCarManufacture();
        Car fso = manufacture.manufactureCar("Fso");

        manufacture = new AmericanCarManufature();
        Car audi = manufacture.manufactureCar("Audi");
    }
}
