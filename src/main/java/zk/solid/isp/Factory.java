package zk.solid.isp;

public class Factory {

    public void maintain() {
        Automobile automobile = new BadCar();
        automobile.maintain();
    }

}
