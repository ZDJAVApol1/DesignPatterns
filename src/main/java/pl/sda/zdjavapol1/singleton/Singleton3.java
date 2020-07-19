package pl.sda.zdjavapol1.singleton;

public class Singleton3 {

    static {
        try {
            instance = new Singleton3();
        } catch (Exception e) {

        }

    }

    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
