package Sorting;

public class Sorting {

    public String[] bubbleSort(String[] array){
        boolean checker = true;
        while (checker){
            checker = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i].length() > array[i+1].length()) {
                    swap(array, i,++i);
                    checker = true;
                }
            }
        }
        return array;
    }

    public String[] selectionSort(String[] array){
        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int i = left; i < array.length; i++) {
                if (array[i].length() < array[minIndex].length())
                    minIndex = i;
            }
            swap(array,left,minIndex);
        }
        return array;
    }

    public String[] shellSort(String[] array){
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c].length() > array[c + gap].length()) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return array;
    }

    private void swap(String[] array, int first, int second){
        String tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

}
