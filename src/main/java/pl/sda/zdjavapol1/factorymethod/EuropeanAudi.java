package pl.sda.zdjavapol1.factorymethod;

public class EuropeanAudi implements Car {
    @Override
    public void start() {
        System.out.println("european audi start");
    }

    @Override
    public void stop() {
        System.out.println("european audi stop");
    }

    @Override
    public void accelerate() {
        System.out.println("european audi accelerate");
    }
}
