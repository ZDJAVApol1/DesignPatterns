package pl.sda.zdjavapol1.singleton;

public class Singleton1 {

    // lazy

    private static Singleton1 innstance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {

        if (innstance == null) {
            innstance = new Singleton1();
        }

        return innstance;
    }
}
