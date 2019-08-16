package zk.solid.dip;

public class Client {

    public void main(String[] args) {
        WeixinApplets weixinApplets = new WeixinApplets();
        FrontEndCoder frontEndCoder = new FrontEndCoder(weixinApplets);
        frontEndCoder.code();
    }
}
