package pl.sda.zdjavapol1.abstractfactory;

public class PetrolEngine implements Engine {
    @Override
    public void produceEngine() {
        System.out.println("petrol engine");
    }
}
