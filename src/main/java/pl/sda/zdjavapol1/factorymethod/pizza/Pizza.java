package pl.sda.zdjavapol1.factorymethod.pizza;

import java.util.ArrayList;

public interface Pizza {

    String getNazwa();

    String getSos();

    ArrayList<String> getDodatki();

    void przygotowanie();

    void pieczenie();

    void krojenie();

    void pakowanie();
}
