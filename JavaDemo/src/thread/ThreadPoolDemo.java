package thread;

/**
 * Created by gavin on 2017/7/3.
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

       /* ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {
            @Override
            public void run() {


                System.out.println(Thread.currentThread().getName());

            }
        });


        executorService.shutdown();*/

       /* long start = System.currentTimeMillis();


        for (int i=0;i<1000000;i++){

            System.out.print("1");
        }

        long end = System.currentTimeMillis();

        System.out.println();

        System.out.println(Thread.currentThread().getName()+"普通耗费时间:"+(end-start));

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future=  executorService.submit(new Runnable() {
            @Override
            public void run() {

                long start = System.currentTimeMillis();


                for (int i=0;i<1000000;i++){


                    System.out.print("2");

                }

                long end = System.currentTimeMillis();
                System.out.println();

                System.out.println(Thread.currentThread().getName()+"耗费时间:"+(end-start));
            }
        });


        try {


            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        executorService.shutdown();*/





    }
}
