package bat.dynamic;

/**
 * 一个背包有一定的承重cap，有N件物品，每件都有自己的价值，记录在数组v中，
 * 也都有自己的重量，记录在数组w中，每件物品只能选择要装入背包还是不装入背包，
 * 要求在不超过背包承重的前提下，选出物品的总价值最大。
 * 给定物品的重量w价值v及物品数n和承重cap。请返回最大总价值。
 * 测试样例：
 * [1,2,3],[1,2,3],3,6
 * [17,34,38,42,36],[335,406,160,452,311],5,90
 * 返回：6
 * @author luxin
 *
 */
public class Backpack {
	public static void main(String[] args) {
		int[] w = {17,34,38,42,36};
		int[] v = {335,406,160,452,311};
		int n = 5;
		int cap = 90;
		System.out.println(maxValue(w, v, n, cap));
	}
    public static int maxValue(int[] w, int[] v, int n, int cap) {
        // write code here
    	//前i个产品，称重为j的时候最大价值
    	int[][] dp = new int[n+1][cap+1];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=cap;j++) {
    			//有两种情况：1.第i个产品加入。2.第i个产品不加入。
    			if(w[i-1]>j) {
    				dp[i][j] = dp[i-1][j];
    			}else {
    				int hasI = dp[i-1][j-w[i-1]]+v[i-1];
        			int hasNotI = dp[i-1][j];
        			dp[i][j] = Math.max(hasI, hasNotI);
    			}
    			
    		}
    	}
    	return dp[n][cap];
    }
}
