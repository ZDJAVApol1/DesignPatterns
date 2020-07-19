package pl.sda.zdjavapol1.factorymethod;

public class AmericanFso implements Car {
    @Override
    public void start() {
        System.out.println("american fso start");
    }

    @Override
    public void stop() {
        System.out.println("american fso stop");
    }

    @Override
    public void accelerate() {
        System.out.println("american fso accelerate");
    }
}
