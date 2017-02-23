package single;

/**
 * Created by molu_ on 2017/2/23.
 */
public class StaticSingleton {

    public StaticSingleton() {
        System.out.println("StaticSingleton is create");
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {

        return SingletonHolder.instance;
    }
}
