package pl.sda.zdjavapol1.abstractfactory;

public interface CarEqiumpmentFactory {

    Engine createEngine();
    Light createLight();
    Tire createTire();
}
