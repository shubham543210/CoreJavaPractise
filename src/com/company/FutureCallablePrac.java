package com.company;

import java.util.concurrent.*;

public class FutureCallablePrac implements Callable {
    int num;

    FutureCallablePrac(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "... is responsible for finding sum of first numbers");
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

class main10 {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        FutureCallablePrac[] jobs = {new FutureCallablePrac(10),
                new FutureCallablePrac(20),
                new FutureCallablePrac(30),
                new FutureCallablePrac(40),
                new FutureCallablePrac(50)};

        ExecutorService ec = Executors.newFixedThreadPool(3);
        for (FutureCallablePrac job : jobs) {
            Future f = ec.submit(job);
            System.out.println(f.get());
        }
        ec.shutdown();
    }
}
