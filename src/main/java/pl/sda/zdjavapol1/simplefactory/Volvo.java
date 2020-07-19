package pl.sda.zdjavapol1.simplefactory;

public class Volvo extends Car {
    @Override
    public void start() {
        System.out.println("Volvo start");
    }

    @Override
    public void stop() {
        System.out.println("Volvo stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Volvo accelerate");
    }
}
