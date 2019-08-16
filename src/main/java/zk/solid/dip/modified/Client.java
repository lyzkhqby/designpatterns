package zk.solid.dip.modified;


public class Client {

    public void main(String[] args) {
        Applets applets = new WeixinApplets();
        // Applets applets = new ZhifubaoApplets();
        Coder coder = new FrontEndCoder(applets);
        coder.code();

    }

}
