package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。
 * 给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。
 * 测试样例：
 * [0,1,1,0,2,2],6
 * 返回：[0,0,1,1,2,2]
 * @author luxin
 *
 */
public class ThreeColor {
	public static void main(String[] args) {
		int[] A = new int[] {2,2,0,2,0};
		System.out.println(Arrays.toString(sortThreeColor(A, 5)));
	}
	public static int[] sortThreeColor(int[] A,int n) {
		int zStart = -1;
		int tStart = n;
		int index = 0;
		int temp = 0;
		while(index !=tStart) {
			if(A[index]==0) {
				if(index==zStart+1) {
					zStart++;
					index++;
				}else {
					temp = A[index];
					A[index++] = A[++zStart];
					A[zStart] = 0;
				}
			}else if(A[index]==1) {
				index++;
			}else {
				tStart--;
				temp = A[tStart];
				A[tStart] = A[index];
				A[index] = temp;
			}
		}
		return A;
	}
	/*public static int[] sortThreeColor(int[] A, int n) {
        // write code here
		int first = 0;
		int last = n-1;
		int temp = 0;
		for(int i=0;i<n&&i<=last;i++) {
			if(A[i] == 0) {
				temp = A[first];
				A[first] = A[i];
				A[i] = temp;
				first++;
			}else if(A[i]==2) {
				temp = A[last];
				A[last] = A[i];
				A[i] = temp;
				last--;
				i--;
			}
		}
		
		return A;
    }*/
}
