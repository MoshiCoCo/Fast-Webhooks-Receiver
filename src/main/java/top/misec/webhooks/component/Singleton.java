package top.misec.webhooks.component;

/**
 * @author moshi
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {

        //判断是否是null
        if (singleton == null) {
            synchronized (Singleton.class) {
                //判断是否是null
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
