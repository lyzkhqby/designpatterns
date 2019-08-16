package zk.strategy.modified.paystrategy;

import zk.strategy.Constant;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Strategy strategy;
    private Map<String, Strategy> strategyMap = new HashMap<String, Strategy>() {
        {
            put(Constant.WEIXIN, new WeixinStrategy());
            put(Constant.ZHIFUBAO, new ZhifubaoStrategy());
        }
    };

    public Context() {

    }

    public void pay(String type) {

    }

}
