package method;

public class SelectionSort {
    /**
     *
     * 选择排序方法
     * @param ints
     * @return
     */
    public static int[] methodSelectionSort(int[] ints) {
        int n = ints.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1; // 下一个数
            int minIndex = i; // 最小值下标
            while (j < n) {
                if (ints[j] < ints[minIndex]) { // 比最小值小
                    minIndex = j;
                }
                if (j == n - 1) { // 做交换
                    int temp = ints[i];
                    ints[i] = ints[minIndex];
                    ints[minIndex] = temp;
                }
                j += 1;
            }
        }
        return ints;
    }
}

