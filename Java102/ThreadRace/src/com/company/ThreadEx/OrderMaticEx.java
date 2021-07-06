package com.company.ThreadEx;

import java.util.List;

public class OrderMaticEx implements Runnable {

    private int orderNumber;
    public OrderMaticEx() {
        this.orderNumber = 0;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        addNumber();
    }

    public  synchronized void addNumber() {

        this.orderNumber++;
        System.out.println(Thread.currentThread().getName() + " no : " + this.orderNumber);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
