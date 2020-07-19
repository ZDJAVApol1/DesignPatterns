package pl.sda.zdjavapol1.simplefactory;

public class Audi extends Car {
    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerate");
    }
}
