package bat.dynamic;

/**
 * 对于两个字符串A和B，我们需要进行插入、删除和修改操作将A串变为B串，定义c0，c1，c2分别为三种操作的代价，请设计一个高效算法，求出将A串变为B串所需要的最少代价。
 * 给定两个字符串A和B，及它们的长度和三种操作代价，请返回将A串变为B串所需要的最小代价。保证两串长度均小于等于300，且三种代价值均小于等于100。
 * 测试样例：
 * "abc",3,"adc",3,5,3,100
 * 返回：8
 * @author luxin
 *
 */
public class MinCost {
    public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        // write code here
    	int[][] dp = new int[A.length()+1][B.length()+1];
    	dp[0][0] = 0;
    	for(int i=1;i<=A.length();i++) {
    		dp[i][0] = c1*i;
    	}
    	for(int i=1;i<=B.length();i++) {
    		dp[0][i] = c0*i;
    	}
    	int left = 0;
    	int up = 0;
    	int nELU = 0;
    	int eLU = 0;
    	for(int i=1;i<=A.length();i++) {
    		for(int j=1;j<=B.length();j++) {
    			left = dp[i][j-1]+c0;
    			up = dp[i-1][j]+c1;
    			nELU = dp[i-1][j-1]+c2;
    			eLU = dp[i-1][j-1];
    			if(A.charAt(i-1)==B.charAt(j-1)) {
    				dp[i][j] = Math.min(left, Math.min(up, eLU));
    			}else {
    				dp[i][j] = Math.min(left, Math.min(up, nELU));
    			}
    		}
    	}
    	
    	return dp[A.length()][B.length()];
    }
}
