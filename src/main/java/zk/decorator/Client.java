package zk.decorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Order order = new CashBack(new Tableware(pizza));
        System.out.println(order.getPrice());
    }
}
