package zk.strategy.modified;

import zk.strategy.Constant;
import zk.strategy.modified.paystrategy.Context;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.pay(Constant.WEIXIN);
    }


}
