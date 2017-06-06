package single;

/**
 * Created by molu_ on 2017/2/23.
 */
public class SingletonDemo {


    public static void main(String[] args) {


        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }

    public static Runnable runnable= () -> {

       long begintime= System.currentTimeMillis();

       for (int i=0;i<100000;i++)
          //Singleton.getInstance();
          //LazySingleton.getInstance();
       StaticSingleton.getInstance();
        System.out.println("spend:"+(System.currentTimeMillis()-begintime));
    };


}
