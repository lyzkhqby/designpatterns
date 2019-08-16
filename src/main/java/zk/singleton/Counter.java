package zk.singleton;

public class Counter {

    private volatile static Counter counter;
    private Counter() {

    }

    public static Counter getInstance() {
        if (counter == null) {
            synchronized (Counter.class) {
                if (counter == null) {
                    counter = new Counter();
                }
            }
        }
        return counter;
    }

}
