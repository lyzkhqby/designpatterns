package zk.strategy;

public class Payment {

    public void pay(String type) {
        if (Constant.WEIXIN.equals(type)) {
            System.out.println("微信支付");
        } else if (Constant.WEIXIN.equals(type)) {
            System.out.println("支付宝支付");
        }
    }

}
