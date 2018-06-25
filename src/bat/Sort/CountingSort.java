package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,5,2,3};
		System.out.println(Arrays.toString(countingSort(A, 6)));
	}

	public static int[] countingSort(int[] A, int n) {
		// write code here
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			minValue = Math.min(minValue, A[i]);
			maxValue = Math.max(maxValue, A[i]);
		}
		int[] result = new int[maxValue - minValue + 1];
		for(int i=0;i<n;i++) {
			result[A[i]-minValue]++;
		}
		for(int i=0,j=0;i<result.length;i++) {
			while(result[i]!=0) {
				A[j] = i+minValue;
				j++;
				result[i]--;
			}
		}
		return A;
	}
	/*
	 * public static int[] countingSort(int[] A, int n) { // write code here int
	 * maxValue = Integer.MIN_VALUE; int minValue = Integer.MAX_VALUE; for(int
	 * i=0;i<n;i++) { minValue = Math.min(minValue, A[i]); maxValue =
	 * Math.max(maxValue, A[i]); } int[] a = new int[maxValue-minValue+1]; for(int
	 * i=0;i<n;i++) { a[A[i]-minValue]++; } int index = 0; for(int
	 * i=0;i<a.length;i++) { if(a[i]!=0) { A[index] = i+minValue; index++; }
	 * while(a[i]>0) { A[index] = i+minValue; index++; a[i]--; } } return A; }
	 */
}
