package single;

/**
 * Created by molu_ on 2017/2/23.
 */
public class LazySingleton {

    public LazySingleton() {

        System.out.println("LazySingleton is create");
        //创建单例的过程可能会比较慢
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {

        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }
}
