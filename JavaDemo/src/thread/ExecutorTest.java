package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by gavin on 2017/7/3.
 */
public class ExecutorTest {

    public static void main(String[] args) {

        //创建一个线程数固定大小为10的线程池
        ExecutorService executorService = Executors.newFixedThreadPool( 10 ) ;

        List<Callable<String>> list = new ArrayList<>() ;


        //创建第一个 Callable
        Callable<String> callable1 = new Callable<String>() {

            @Override
            public String call() throws Exception {
                System.out.println( "callable 1 线程是： "+ Thread.currentThread().getName()  );
                return "执行完了 callable 1" ;
            }
        };

        //创建第二个 Callable
        Callable<String> callable2 = new Callable<String>() {

            @Override
            public String call() throws Exception {
                System.out.println( "callable 2 线程是： "+ Thread.currentThread().getName()  );
                return "执行完了 callable 2" ;
            }
        };

        list.add( callable1 ) ;
        list.add( callable2 ) ;


        try {
            String result = executorService.invokeAny( list ) ;





            System.out.println("返回的结果:"+result);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
