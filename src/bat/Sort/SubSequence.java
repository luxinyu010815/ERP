package bat.Sort;

public class SubSequence {
	public static void main(String[] args) {
		int[] arr = {1,2,4,4,2,1,3,5};
		System.out.println(shortestSubsequence(arr, 8));
	}
	public static int shortestSubsequence(int[] A, int n) {
        // write code here
		int minIndex = n-1;
		int maxIndex = 0;
		int stemp = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			stemp = Math.max(stemp, A[i]);
			if(stemp>A[i]) {
				maxIndex = i;
			}
		}
		stemp = Integer.MAX_VALUE;
		for(int i=n-1;i>=0;i--) {
			stemp = Math.min(stemp, A[i]);
			if(stemp<A[i]) {
				minIndex = i;
			}
		}
		int result = maxIndex-minIndex+1;
		return result>0?result:0;
    }
}
