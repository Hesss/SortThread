package Threads;

import Sorting.Sorting;

import java.util.Arrays;

public class ShellSortThread implements Runnable{
    private String[] array;

    public ShellSortThread(String[] array){
        this.array = array;
    }

    @Override
    public void run() {
        Sorting sorting = new Sorting();
        array = sorting.shellSort(array);
        System.out.println("Отсортировано методом Шелла:");
        System.out.println(Arrays.toString(array));
    }
}
