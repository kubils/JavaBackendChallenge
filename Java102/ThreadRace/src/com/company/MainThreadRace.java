package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadRace {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        List<List<Integer>> subList = new ArrayList<>();
        subList.add(list.subList(0, 2500));
        subList.add(list.subList(2500, 5000));
        subList.add(list.subList(5000, 7500));
        subList.add(list.subList(7500, 10000));

        Thread t1 = new Thread(new OrderMatic(subList.get(0)));
        Thread t2 = new Thread(new OrderMatic(subList.get(1)));
        Thread t3 = new Thread(new OrderMatic(subList.get(2)));
        Thread t4 = new Thread(new OrderMatic(subList.get(3)));

        //OrderMatic run methods will call after start()
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
