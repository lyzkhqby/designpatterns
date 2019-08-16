package zk.strategy.modified;

import zk.strategy.Constant;
import zk.strategy.Payment;

public class Client {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay(Constant.WEIXIN);

    }


}
