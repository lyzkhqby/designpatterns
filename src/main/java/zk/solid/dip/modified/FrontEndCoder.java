package zk.solid.dip.modified;

public class FrontEndCoder implements Coder {

    Applets applets;

    public FrontEndCoder(Applets applets) {
        this.applets = applets;
    }

    public void code() {
        applets.finish();
    }

}
