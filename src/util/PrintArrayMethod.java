package util;

public class PrintArrayMethod implements PrintArray{
    public void printArray(int[] ints) {
        for(int a : ints) {
            System.out.print(a);
        }
    }
}
