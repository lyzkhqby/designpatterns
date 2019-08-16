package zk.solid.isp;

public class BadCar implements Automobile {

    public void maintain() {
        System.out.println("maintain: bad car");
    }

    public void drive() {
        System.out.println("drive: bad car");
    }
}
