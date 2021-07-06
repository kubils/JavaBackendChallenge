package com.company;

import java.util.ArrayList;
import java.util.List;

public class OrderMatic implements Runnable {

    private List<Integer> subList;
    private List<Integer> oddNumbers;
    private List<Integer> evenNumbers;

    public OrderMatic(List<Integer> list) {
        this.subList = list;
        oddNumbers = new ArrayList<Integer>();
        evenNumbers = new ArrayList<Integer>();
    }

    @Override
    public void run() {
        addList();
    }

    public synchronized void addList() {
        for (int i : subList) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
                System.out.print(Thread.currentThread().getName() + " even numbers :" + i);

            } else {
                oddNumbers.add(i);
                System.out.print(Thread.currentThread().getName() + " odd numbers : " + i);
            }
            System.out.println();
        }
    }

    public List<Integer> getSubList() {
        return subList;
    }

    public void setSubList(List<Integer> subList) {
        this.subList = subList;
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(List<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(List<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }


}
