package test;

import method.InsertionSort;
import util.PrintArrayMethod;
import util.TestArray;

public class TestInsertionSort {
    public static void main(String[] args) {
        PrintArrayMethod printArrayMethod = new PrintArrayMethod();
        printArrayMethod.printArrayBeforeTest(TestArray.test);
        printArrayMethod.printArrayAfterTest(InsertionSort.methodInsertionSort(TestArray.test));
    }
}
