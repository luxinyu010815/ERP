package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��һ��ֻ��0��1��2����Ԫ�ع��ɵ��������飬��ʹ�ý�����ԭ�����������ʹ�ü�����������
 * ����һ��ֻ��0��1��2����������A�����Ĵ�С���뷵�����������顣��֤�����СС�ڵ���500��
 * ����������
 * [0,1,1,0,2,2],6
 * ���أ�[0,0,1,1,2,2]
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
