package pl.sda.zdjavapol1.paradygmaty;

public abstract class Car implements CarInterface {

    private Engine engine;

    public void drive() {
        engine.start();
        // ...
    }

    public abstract void accelerate();

    public Engine getEngine() {
        return engine;
    }

    public void checkEngine(EngineChecker engineChecker) {
        engineChecker.checkEngine();
    }
}
