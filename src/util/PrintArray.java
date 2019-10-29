package util;

public interface PrintArray {
    /**
     *
     * 打印数组
     * @param ints
     */
    public void printArray(int[] ints);

    /**
     *
     * 在测试之前打印数组
     * @param ints
     */
    public void printArrayBeforeTest(int[] ints);

    /**
     *
     * 在测试之后打印数组
     * @param ints
     */
    public void printArrayAfterTest(int[] ints);
}
