package bat.Sort;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,2,3,3,5,0,0,0};
		int[] B = new int[] {2,6,9};
		System.out.println(Arrays.toString(mergeAB(A, B,6,3)));
	}
	public static int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
		int endA = n-1;
		int endB = m-1;
		for(int i=A.length-1;i>=0;i--) {
			if(endA>=0&&endB>=0) {
				A[i] = Math.max(A[endA], B[endB]);
				if(A[endA]>=B[endB]) {
					endA--;
				} else {
					endB--;
				}
			}else if(endA<0){
				A[i] = B[endB--];
			}else {
				A[i] = A[endA--];
			}
		}
		return A;
    }
	/*public static int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
		int index = n+m-1;
		int aLast = n-1;
		int bLast = m-1;
		while(aLast>=0&&bLast>=0&&index>=0) {
			if(A[aLast]>B[bLast]) {
				A[index] = A[aLast];
				aLast--;
			}else {
				A[index] = B[bLast];
				bLast--;
			}
			index--;
		}
		if(aLast<=0) {
			while(bLast>=0) {
				A[index] = B[bLast];
				bLast--;
				index--;
			}
		}
		
		if(bLast<=0) {
			while(aLast>=0) {
				A[index] = A[aLast];
				aLast--;
				index--;
			}
		}
		
		return A;
    }*/
}
