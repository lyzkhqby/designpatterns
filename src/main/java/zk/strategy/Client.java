package zk.strategy;

public class Client {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay(Constant.WEIXIN);
    }


}
