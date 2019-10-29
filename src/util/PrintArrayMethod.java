package util;

public class PrintArrayMethod implements PrintArray{
    @Override
    public void printArray(int[] ints) {
        for(int a : ints) {
            System.out.print(a);
        }
    }

    @Override
    public void printArrayBeforeTest(int[] ints) {
        System.out.print("测试前的数组如下：");
        for(int a : ints) {
            System.out.print(a);
        }
        System.out.print("\n");
    }

    @Override
    public void printArrayAfterTest(int[] ints) {
        System.out.print("打印测试后的数组如下：");
        for(int a : ints) {
            System.out.print(a);
        }
        System.out.print("\n");
    }
}
