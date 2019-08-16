package zk.decorator;

public class Tableware extends OrderDecorator{


    public Tableware(Order order) {
        super(order);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
