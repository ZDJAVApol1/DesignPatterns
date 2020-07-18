package pl.sda.zdjavapol1.stan;

public class VendingMachine {

    private VendingMachineState state;
    private int costOfProduct;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void buyProduct(int amount) {
        costOfProduct = amount;
        state.getProduct(amount, this);
    }

    public void takeProduct() {
        state.getProduct(costOfProduct, this);
    }
}
