package pl.sda.zdjavapol1.abstractfactory;

public class LedLight implements Light {
    @Override
    public void produceLight() {
        System.out.println("led light");
    }
}
