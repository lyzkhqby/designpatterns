package zk.strategy.modified;

import zk.strategy.modified.paystrategy.Context;

public class Payment {

    Context context;
    public Payment() {
        context = new Context();
    }

    public void pay(String type) {
        context.pay(type);
    }

}
