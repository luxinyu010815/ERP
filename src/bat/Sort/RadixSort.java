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
		//创建list数组中装队列
		List<Queue<Integer>> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(new ArrayDeque<Integer>());
		}
		int stemp = 1;
		int index = 0;
		while(true) {
			//将整数根据基数放入list
			for(int i=0;i<n;i++) {
				index = (A[i]%(stemp*10))/stemp;
				list.get(index).offer(A[i]);
			}
			//若0队列中数字的个数大于等于n，表明某位上的数字全为0
			if(list.get(0).size()>=n) {
				break;
			}
			//将list中的数据放回A
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
