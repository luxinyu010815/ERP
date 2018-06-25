package bat.Sort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class RadixSort {
	public static void main(String[] args) {
		int[] A = new int[] { 1, 2001, 329, 5, 2, 3 };
		System.out.println(Arrays.toString(radixSort(A, 6)));
	}

	public static int[] radixSort(int[] A, int n) {
		// write code here
		//����list������װ����
		List<Queue<Integer>> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(new ArrayDeque<Integer>());
		}
		int stemp = 1;
		int index = 0;
		while(true) {
			//���������ݻ�������list
			for(int i=0;i<n;i++) {
				index = (A[i]%(stemp*10))/stemp;
				list.get(index).offer(A[i]);
			}
			//��0���������ֵĸ������ڵ���n������ĳλ�ϵ�����ȫΪ0
			if(list.get(0).size()>=n) {
				break;
			}
			//��list�е����ݷŻ�A
			for(int i=0,j=0;i<n;i++) {
				while(list.get(j).size()==0) {
					j++;
				}
				A[i] = list.get(j).poll();
			}
			stemp*=10;
		}
		return A;
	}
}
