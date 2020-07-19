package pl.sda.zdjavapol1.factorymethod;

public class AmericanVolvo implements Car {
    @Override
    public void start() {
        System.out.println("american volvo start");
    }

    @Override
    public void stop() {
        System.out.println("american volvo stop");
    }

    @Override
    public void accelerate() {
        System.out.println("american volvo accelerate");
    }
}
