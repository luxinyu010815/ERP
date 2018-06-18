package bat.dynamic;

/**
 * ����һ�������LIS(�������������)���⣬�����һ�������ŵĽⷨ������е�����������еĳ��ȡ�
 * ����һ������A�����ĳ���n(����С�ڵ���500)���뷵��LIS�ĳ��ȡ�
 * ����������
 * [1,4,2,5,3],5
 * ���أ�3
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
