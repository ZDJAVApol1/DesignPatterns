package pl.sda.zdjavapol1.singleton;

public class Singleton2 {

    // eager - żarliwy :)

    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
        // ...
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
