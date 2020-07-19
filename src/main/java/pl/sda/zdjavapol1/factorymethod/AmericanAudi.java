package pl.sda.zdjavapol1.factorymethod;

public class AmericanAudi implements Car {
    @Override
    public void start() {
        System.out.println("american audi start");
    }

    @Override
    public void stop() {
        System.out.println("american audi stop");
    }

    @Override
    public void accelerate() {
        System.out.println("american audi accelerate");
    }
}
