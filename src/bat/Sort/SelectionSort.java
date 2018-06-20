package bat.Sort;

import java.util.Arrays;

/**
 * 对于一个int数组，请编写一个选择排序算法，对数组元素排序。
 * 给定一个int数组A及数组的大小n，请返回排序后的数组。
 * 测试样例：
 * [1,2,3,5,2,3],6
 * [1,2,2,3,3,5]
 * @author luxin
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,5,2,3};
		System.out.println(Arrays.toString(selectionSort(A, 6)));
	}
    public static int[] selectionSort(int[] A, int n) {
        // write code here
    	int temp = 0;
    	int max = 0;
    	for(int i=n-1;i>=0;i--) {
    		max=0;
    		for(int j=0;j<=i;j++) {
    			max = A[max]>A[j]?max:j;
    		}
    		temp = A[i];
    		A[i] = A[max];
    		A[max] = temp;
    	}
    	return A;
    }
}
