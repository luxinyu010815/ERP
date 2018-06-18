package bat.dynamic;

/**
 * 这是一个经典的LIS(即最长上升子序列)问题，请设计一个尽量优的解法求出序列的最长上升子序列的长度。
 * 给定一个序列A及它的长度n(长度小于等于500)，请返回LIS的长度。
 * 测试样例：
 * [1,4,2,5,3],5
 * 返回：3
 * @author luxin
 *
 */
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] A = {1,4,2,5,3};
		System.out.println(getLIS(A, 5));
	}
    public static int getLIS(int[] A, int n) {
        // write code here
    	int[] dp = new int[n];
    	dp[0] = 1;
    	int max = 0;
    	int maxResult = 0;
    	for(int i=1;i<n;i++) {
    		max = 0;
    		for(int j=0;j<=i;j++) {
    			if(A[j]<A[i]) {
    				max = dp[j]>max?dp[j]:max;
    			}
    		}
    		if(max==0) {
    			dp[i] = 1;
    		}else {
    			dp[i] = max+1;
    		}
    		
    		maxResult = dp[i]>maxResult?dp[i]:maxResult;
    	}
    	return maxResult;
    }
}
