package pl.sda.zdjavapol1.singleton;

public class Singleton5 {

    private static Singleton5 instance;
    private static final Object object = new Object();

    private Singleton5() {

    }

    public static Singleton5 getInstance() {

        synchronized (object) {
            if (instance == null) {

                synchronized (object) {
                    instance = new Singleton5();
                }
            }
        }

        return instance;
    }
}
