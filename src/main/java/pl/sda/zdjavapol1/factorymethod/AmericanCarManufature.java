package pl.sda.zdjavapol1.factorymethod;

public class AmericanCarManufature extends CarManufacture {
    @Override
    protected Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AmericanAudi();
        } else if (type.equals("Volvo")) {
            return new AmericanVolvo();
        } else if (type.equals("Fso")) {
            return new AmericanFso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
