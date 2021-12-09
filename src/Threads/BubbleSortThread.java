package Threads;

import Sorting.Sorting;

import java.util.Arrays;

public class BubbleSortThread implements Runnable {
    private String[] array;

    public BubbleSortThread(String[] array){
        this.array = array;
    }

    @Override
    public void run() {
        Sorting sorting = new Sorting();
        array = sorting.bubbleSort(array);
        System.out.println("Отсортировано пузырьком:");
        System.out.println(Arrays.toString(array));
    }
}
