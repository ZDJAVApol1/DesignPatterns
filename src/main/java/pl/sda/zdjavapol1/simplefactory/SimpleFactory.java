package pl.sda.zdjavapol1.simplefactory;

public class SimpleFactory {

    public static Car createCar(String type) {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Volvo")) {
            return new Volvo();
        } else if (type.equals("Fso")) {
            return new Fso();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
