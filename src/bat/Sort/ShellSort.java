package bat.Sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,5,2,3};
		System.out.println(Arrays.toString(shellSort(A, 6)));
	}
	public static int[] shellSort(int[] A, int n) {
        // write code here
    	int stemp = n/2;
    	while(stemp>0) {
    		for(int i=0;i<stemp;i++) {
    			quickSort(A, i, stemp);
    		}
    		stemp/=2;
    	}
    	return A;
    }
	public static int[] quickSort(int[] A,int start, int stemp) {
		int tap = A[start];
		for(int i=start;i<A.length;i+=stemp) {
			tap = A[i];
			for(int j=i;j>start;j-=stemp) {
				if(tap<A[j-stemp]) {
					A[j] = A[j-stemp];
					A[j-stemp] = tap;
				}else {
					break;
				}
			}
		}
		return A;
	}
    /*public static int[] shellSort(int[] A, int n) {
        // write code here
    	int stemp = n/2;
    	while(stemp>=1) {
    		insertSort(A, stemp);
    		stemp/=2;
    	}
    	return A;
    }
    public static int[] insertSort(int[] a,int stemp) {
    	int currentIndex = 0;
    	int nextIndex = 0;
    	int ext = 0;
    	for(int i=stemp;i<a.length;i++) {
    		currentIndex = i;
    		nextIndex = currentIndex-stemp;
    		while(nextIndex>=0) {
    			ext = 0;
    			if(a[currentIndex]<a[nextIndex]) {
    				ext = a[currentIndex];
    				a[currentIndex] = a[nextIndex];
    				a[nextIndex] = ext;
    				currentIndex = nextIndex;
    			}else {
    				nextIndex-=stemp;
    			}
    		}
    	}
    	
    	return a;
    }*/
}