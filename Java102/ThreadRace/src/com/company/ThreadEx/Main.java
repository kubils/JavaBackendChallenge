package com.company.ThreadEx;

import com.company.OrderMatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        OrderMaticEx orderMatic = new OrderMaticEx();
//        List<Thread> threads = new ArrayList<Thread>();

        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            executor.execute(orderMatic);
//            Thread t = new Thread(orderMatic);
//            threads.add(t);
//            t.start();
        }

        executor.shutdown();
    }
}
