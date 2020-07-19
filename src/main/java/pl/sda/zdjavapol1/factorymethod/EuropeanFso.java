package pl.sda.zdjavapol1.factorymethod;

public class EuropeanFso implements Car {
    @Override
    public void start() {
        System.out.println("european fso start");
    }

    @Override
    public void stop() {
        System.out.println("european fso stop");
    }

    @Override
    public void accelerate() {
        System.out.println("european fso accelerate");
    }
}
