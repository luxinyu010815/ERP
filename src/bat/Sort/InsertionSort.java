package bat.Sort;

import java.util.Arrays;

/**
 * ����һ��int���飬���дһ�����������㷨��������Ԫ������
 * ����һ��int����A������Ĵ�Сn���뷵�����������顣
 * ����������
 * [1,2,3,5,2,3],6
 * [1,2,2,3,3,5]
 * @author luxin
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] A = new int[] {8,2,3,5,2,3};
		System.out.println(Arrays.toString(insertionSort(A, 6)));
	}
    public static int[] insertionSort(int[] A, int n) {
        // write code here
    	int temp=0;
    	for(int i=0;i<n;i++) {
    		temp=A[i];
    		for(int j=i;j>0;j--) {
    			if(temp<A[j-1]) {
    				A[j] = A[j-1];
    				A[j-1] = temp;
    			}
    		}
    	}
    	return A;
    }
    
    
    /**
     * public int[] insertionSort(int[] A, int n) {
        // write code here
        int num = 0;
    	for(int i=1;i<n;i++){
    		num = A[i];
    		for(int j=i-1;j>=0;j--){
    			if(num<=A[j]){
    				A[j+1] = A[j];
    				A[j] = num;
    			}
    		}
    	}
    	return A;
    }
     */
}
