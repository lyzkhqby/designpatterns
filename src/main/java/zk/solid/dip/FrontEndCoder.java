package zk.solid.dip;

public class FrontEndCoder {

    WeixinApplets weixinApplets;

    public FrontEndCoder(WeixinApplets weixinApplets) {
        this.weixinApplets = weixinApplets;
    }

    public void code() {
        weixinApplets.finish();
    }


}
