package zk.singleton;
/*
http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/
 */
public class Singleton {

    private volatile static Singleton singleton;
    private Singleton() {

    }

    /**
     * https://juejin.im/post/5cb98c94f265da03a743ef6c
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
