package test;

import method.SelectionSort;
import util.PrintArrayMethod;
import util.TestArray;

public class TestSelectionSort {
    public static void main(String[] args) {
        PrintArrayMethod printArrayMethod = new PrintArrayMethod();
        printArrayMethod.printArrayBeforeTest(TestArray.test);
        printArrayMethod.printArrayAfterTest(SelectionSort.methodSelectionSort(TestArray.test));
    }
}
