package test;

import method.InsertionSort;
import util.PrintArrayMethod;

public class TestInsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] test;
        test = new int[]{1, 3, 9, 7, 2};
        System.out.print("排序前的数组：");
        PrintArrayMethod printArrayMethod = new PrintArrayMethod();
        printArrayMethod.printArray(test);
        test = insertionSort.methodInsertionSort(test);
        System.out.print("排序后的数组：");
        printArrayMethod.printArray(test);
    }
}
