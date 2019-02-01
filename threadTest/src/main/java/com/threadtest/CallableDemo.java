package com.threadtest;

import java.util.concurrent.*;

public class CallableDemo implements Callable<String> {
    public static void main(String[] args) {

        try {
            ExecutorService  executorService = Executors.newCachedThreadPool();//创建一个线程池
            CallableDemo callableDemo = new CallableDemo();
            Future<String> future = executorService.submit(callableDemo);
            System.out.println(future.get());
            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String call() throws Exception {
        return "string"+1;
    }
}
