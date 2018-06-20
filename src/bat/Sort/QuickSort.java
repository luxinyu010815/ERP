package bat.Sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) throws InterruptedException {
		int[] a = new int[] { 1, 2, 3, 5, 2, 3 };
		System.out.println(Arrays.toString(new QuickSort().quickSort(a, 6)));
	}

	public int[] quickSort(int[] A, int n) {
		// write code here
		sort(A, 0, n - 1);
		return A;
	}

	public void sort(int[] A, int start, int end) {
		if (start >= A.length || end >= A.length||start>=end)
			return;
		int temp = A[start];
		int first = start;
		int last = end;
		boolean flag = true;
		while (first < last) {
			if (flag) {
				if (temp > A[last]) {
					A[first++] = A[last];
					flag = false;
				} else {
					last--;
				}
			} else {
				if (temp < A[first]) {
					A[last--] = A[first];
					flag = true;
				} else {
					first++;
				}
			}
		}
		A[first] = temp;
		sort(A, start, first - 1);
		sort(A, first + 1, end);
	}
	/*
	 * public static int[] quickSort(int[] A, int n) { // write code here
	 * getResult(A,0,A.length-1); return A; } public static void getResult(int[]
	 * a,int first,int last){ int temp = a[first]; int start = first; int end =
	 * last; if(first<end){ while(first<last){ while(a[last]>=temp&&last>first){
	 * last--; } if(first==last){ break; } a[first] = a[last]; first++;
	 * while(a[first]<temp&&first<last){ first++; } if(first==last){ break; }
	 * a[last] = a[first]; last--; } a[first] = temp;
	 * if(start<first-1)getResult(a,start,first-1);
	 * if(first+1<end)getResult(a,first+1,end); }
	 * 
	 * }
	 */
}
