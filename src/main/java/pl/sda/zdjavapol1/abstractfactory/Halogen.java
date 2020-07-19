package pl.sda.zdjavapol1.abstractfactory;

public class Halogen implements Light {
    @Override
    public void produceLight() {
        System.out.println("halogen light");
    }
}
