package pl.sda.zdjavapol1.abstractfactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        CarEqiumpmentFactory carEqiumpmentFactory = new EconomyCarEquiomentFactory();

        Engine engine = carEqiumpmentFactory.createEngine();
        engine.produceEngine();

        Light light = carEqiumpmentFactory.createLight();
        light.produceLight();

        Tire tire = carEqiumpmentFactory.createTire();
        tire.produceTire();

        System.out.println();

        carEqiumpmentFactory = new ComfortCarEquipmentFactory();

        engine = carEqiumpmentFactory.createEngine();
        engine.produceEngine();

        light = carEqiumpmentFactory.createLight();
        light.produceLight();

        tire = carEqiumpmentFactory.createTire();
        tire.produceTire();
    }
}
