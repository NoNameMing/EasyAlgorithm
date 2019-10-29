package test;

import method.BubbleSort;
import util.PrintArrayMethod;
import util.TestArray;

public class TestBubbleSort {
    public static void main(String[] args) {
        PrintArrayMethod printArrayMethod = new PrintArrayMethod();
        printArrayMethod.printArrayBeforeTest(TestArray.test);
        printArrayMethod.printArrayAfterTest(BubbleSort.methodBubbleSort(TestArray.test));
    }
}
