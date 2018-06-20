package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于一个int数组，请编写一个归并排序算法，对数组元素排序。
 * 给定一个int数组A及数组的大小n，请返回排序后的数组。
 * 测试样例：
 * [1,2,3,5,2,3],6
 * [1,2,2,3,3,5]
 * @author luxin
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,5,2,3};
		System.out.println(Arrays.toString(new MergeSort().mergeSort(a, 6)));
	}

	public static int[] mergeSort(int[] A, int n) {
		// write code here
		merge(A, 0, n-1);
		return A;
	}
	
	public static int[] merge(int[] A, int start,int end) {
		int length = end-start;
		int mid = (end+start)/2;
		int max = 0;
		int min = 0;
		if(length==1) {
			max = Math.max(A[start], A[end]);
			min = Math.min(A[start], A[end]);
			A[start] = min;
			A[end] = max;
			return A;
		}else if(length<=0) {
			return A;
		}
		if(length>1) {
			merge(A, start, mid);
			merge(A, mid+1, end);
		}
		int[] a = new int[mid+1-start];
		int[] b = new int[end-mid];
		for(int i=0;i<a.length;i++) {
			a[i] = A[start+i];
		}
		for(int i=0;i<b.length;i++) {
			b[i] = A[mid+1+i];
		}
		for(int i=start,j=0,k=0;i<=end;i++) {
			if(j>=a.length) {
				A[i] = b[k];
				k++;
				continue;
			}
			if(k>=b.length) {
				A[i] = a[j];
				j++;
				continue;
			}
			if(a[j]<b[k]) {
				A[i] = a[j];
				j++;
			}else if(a[j]>b[k]) {
				A[i] = b[k];
				k++;
			}else {
				A[i++] = a[j];
				j++;
				A[i] = b[k];
				k++;
			}
		}
		return A;
	}
	/*
	 * public int[] mergeSort(int[] A, int n) { // write code here if(A.length<2)
	 * return A; getResult(A,0,n-1); return A; }
	 * 
	 * public void getResult(int[] arr,int left,int right) { if(left>=right) return;
	 * int mid = (left+right)/2; getResult(arr,left,mid);
	 * getResult(arr,mid+1,right); merge(arr,left,mid,right); }
	 * 
	 * public void merge(int[] arr,int left,int mid,int right) { int[] help = new
	 * int[right-left+1]; if(right-left<2) { int inter = 0; if(arr[left]>arr[right])
	 * { inter = arr[left]; arr[left] = arr[right]; arr[right] = arr[left]; }
	 * return; } int first = left; int second = mid+1; for(int
	 * i=0;i<help.length;i++) { if(first>mid) { help[i] = arr[second++]; continue; }
	 * if(second>right) { help[i] = arr[first++]; continue; }
	 * if(arr[first]<=arr[second]) { help[i] = arr[first]; first++; }else
	 * if(arr[first]>arr[second]){ help[i] = arr[second]; second++; } }
	 * 
	 * for(int i=0;i<help.length;i++) { arr[left+i] = help[i]; } }
	 */
}
