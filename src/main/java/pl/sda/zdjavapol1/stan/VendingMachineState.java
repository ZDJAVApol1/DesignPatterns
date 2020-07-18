package pl.sda.zdjavapol1.stan;

public abstract class VendingMachineState {

    public abstract void changeVendingMachineState(VendingMachine context);

    public abstract void getProduct(int amount, VendingMachine context);
}
