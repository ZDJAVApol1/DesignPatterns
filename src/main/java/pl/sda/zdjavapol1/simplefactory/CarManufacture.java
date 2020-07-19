package pl.sda.zdjavapol1.simplefactory;

public class CarManufacture {

//    private SimpleFactory simpleFactory;
//
//    public CarManufacture(SimpleFactory simpleFactory) {
//        this.simpleFactory = simpleFactory;
//    }

    public void manufactureCar(String type) {

        Car car = SimpleFactory.createCar(type);

        car.start();
        car.accelerate();
        car.stop();
    }
}
