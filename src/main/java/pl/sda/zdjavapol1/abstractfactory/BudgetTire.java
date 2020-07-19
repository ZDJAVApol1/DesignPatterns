package pl.sda.zdjavapol1.abstractfactory;

public class BudgetTire implements Tire {
    @Override
    public void produceTire() {
        System.out.println("budget tire");
    }
}
