package pl.sda.zdjavapol1.factorymethod;

public abstract class CarManufacture {

    public Car manufactureCar(String type) {

        Car car = createCar(type);

        car.start();
        car.accelerate();
        car.stop();

        return car;
    }

    protected abstract Car createCar(String type);
}
