package pl.sda.zdjavapol1.singleton;

public class SingletonApp {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        // ...

        Singleton7.INSTANCE.cokolwiek();
    }
}
