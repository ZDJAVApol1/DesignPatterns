package pl.sda.zdjavapol1.simplefactory;

public class Fso extends Car {
    @Override
    public void start() {
        System.out.println("Fso start");
    }

    @Override
    public void stop() {
        System.out.println("Fso stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Fso accelarate");
    }
}
