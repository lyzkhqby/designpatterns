package zk.decorator;

public class OrderDecorator implements Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    public double getPrice() {
        return order.getPrice();
    }
}
