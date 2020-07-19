package pl.sda.zdjavapol1.abstractfactory;

public class HybridEngine implements Engine {
    @Override
    public void produceEngine() {
        System.out.println("hybrid engine");
    }
}
