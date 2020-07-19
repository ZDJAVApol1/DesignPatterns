package pl.sda.zdjavapol1.abstractfactory;

public class EconomyCarEquiomentFactory implements CarEqiumpmentFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Light createLight() {
        return new Halogen();
    }

    @Override
    public Tire createTire() {
        return new BudgetTire();
    }
}
