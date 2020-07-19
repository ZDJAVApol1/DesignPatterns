package pl.sda.zdjavapol1.factorymethod.pizza;

import java.util.ArrayList;

public class WloskaPizzaSerowa implements Pizza {

    @Override
    public String getNazwa() {
        return "włoska pizza serowa";
    }

    @Override
    public String getSos() {
        return "Pomidorowy";
    }

    @Override
    public ArrayList<String> getDodatki() {
        return new ArrayList<String>();
    }

    @Override
    public void przygotowanie() {
        System.out.println("przygotowanie włoskiej pizzy serowej");
    }

    @Override
    public void pieczenie() {
        System.out.println("pieczenie włoskiej pizzy serowej");
    }

    @Override
    public void krojenie() {
        System.out.println("krojenie włoskiej pizzy serowej");
    }

    @Override
    public void pakowanie() {
        System.out.println("pakowanie włoskiej pizzy serowej");
    }
}
