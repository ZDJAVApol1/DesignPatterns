package pl.sda.zdjavapol1.abstractfactory;

public class PremiumTire implements Tire {
    @Override
    public void produceTire() {
        System.out.println("premium tire");
    }
}
