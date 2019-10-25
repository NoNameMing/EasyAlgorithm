package method;

import util.PrintArray;
import util.PrintArrayMethod;

public class InsertionSort {
    /**
     * 插入排序实现
     * @param ints
     */
    public static int[] methodInsertionSort(int[] ints) {
        int n = ints.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int a = ints[i], b = ints[j];
            if (a <= b) {
                continue;
            } else {
                int l = i, r = j;
                while (r > 0 && (ints[l] > ints[r])) {
                    int temp = ints[r];
                    ints[r--] = ints[l];
                    ints[l--] = temp;
                }
            }
        }
        return ints;
    }
}
