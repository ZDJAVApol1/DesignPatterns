package pl.sda.zdjavapol1.abstractfactory;

public class ComfortCarEquipmentFactory implements CarEqiumpmentFactory {
    @Override
    public Engine createEngine() {
        return new HybridEngine();
    }

    @Override
    public Light createLight() {
        return new LedLight();
    }

    @Override
    public Tire createTire() {
        return new PremiumTire();
    }
}
