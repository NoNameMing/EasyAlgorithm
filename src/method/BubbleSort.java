package method;

public class BubbleSort {
    /**
     *
     * 冒泡排序实现
     * @param ints
     * @return
     */
    public static int[] methodBubbleSort(int[] ints) {
        int n = ints.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                int l = j - 1;
                int r = j;
                if (ints[l] > ints[r]) {
                    int temp = ints[l];
                    ints[l] = ints[r];
                    ints[r] = temp;
                }
            }
        }
        return ints;
    }
}
