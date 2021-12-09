package Threads;

import Sorting.Sorting;

import java.util.Arrays;

public class SelectionSortThread implements Runnable {
    private String[] array;

    public SelectionSortThread(String[] array){
        this.array = array;
    }

    @Override
    public void run() {
        Sorting sorting = new Sorting();
        array = sorting.selectionSort(array);
        System.out.println("Отсортировано вставками:");
        System.out.println(Arrays.toString(array));
    }
}
