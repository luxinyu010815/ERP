package bat.Sort;

import java.util.Arrays;

/**
 * ����һ��int���飬���дһ��ѡ�������㷨��������Ԫ������
 * ����һ��int����A������Ĵ�Сn���뷵�����������顣
 * ����������
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
