package single;

/**
 * Created by molu_ on 2017/2/23.
 */
public class Singleton {

    public Singleton() {

        System.out.println("Singleton is create");
    }
    private static Singleton instance=new Singleton();

    public static Singleton getInstance(){

        return instance;
    }

    public static void createString(){
        System.out.println("Create String in Singleton");
    }
}
