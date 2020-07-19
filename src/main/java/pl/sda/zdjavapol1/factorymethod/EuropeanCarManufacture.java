package pl.sda.zdjavapol1.factorymethod;

public class EuropeanCarManufacture extends CarManufacture {
    @Override
    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new EuropeanAudi();
        } else if (type.equals("Volvo")) {
            return new EuropeanVolvo();
        } else if (type.equals("Fso")) {
            return new EuropeanFso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
