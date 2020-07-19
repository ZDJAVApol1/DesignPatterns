package pl.sda.zdjavapol1.factorymethod;

public class EuropeanVolvo implements Car {
    @Override
    public void start() {
        System.out.println("european volvo start");
    }

    @Override
    public void stop() {
        System.out.println("european volvo stop");
    }

    @Override
    public void accelerate() {
        System.out.println("european volvo accelerate");
    }
}
