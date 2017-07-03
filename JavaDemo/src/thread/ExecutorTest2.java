package thread;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by gavin on 2017/7/3.
 */
public class ExecutorTest2 {

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


        List<Future<String>> result;
        try {
            result = executorService.invokeAll( list );

            for (Future<String> future : result) {
                System.out.println( "结果是： "+ future.get()  );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //关闭线程池
        executorService.shutdown();



    }
}
