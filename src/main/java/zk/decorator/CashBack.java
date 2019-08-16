package zk.decorator;

public class CashBack extends OrderDecorator {

    public CashBack(Order order) {
        super(order);
    }

    @Override
    public double getPrice() {
        return super.getPrice() - 1;
    }
}
