package pl.sda.zdjavapol1.factorymethod.pizza;

public class PizzaApp {

    public static void main(String[] args) {


        // rodzaj ciasta - String
        // sos - String
        // dodatki - ArrayList<String>

        // przygotowanie()
        // pieczenie()
        // krojenie()
        // pakowanie()

        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizza wloskaPizzaSerowa = wloskaPizzeria.orderPizza("serowa");

//        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
//        Pizza amerykanskaPizzaSerowa = amerykanskaPizzeria.zamowPizza("serowa");
    }
}
