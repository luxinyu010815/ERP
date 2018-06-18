package bat.dIQ;

/**
 * 你要在一个nxm的格子图上涂色，你每次可以选择一个未涂色的格子涂上你开始选定的那种颜色。同时为了美观，我们要求你涂色的格子不能相邻，也就是说，不能有公共边，现在问你，在采取最优策略的情况下，你最多能涂多少个格子？
 * 给定格子图的长n和宽m。请返回最多能涂的格子数目。 测试样例： 1,2 返回：1
 * 
 * @author luxin
 *
 */
public class Paint {
	public int getMost(int n, int m) {
		// write code here
		/*int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			dp[i][1] = i % 2 == 1 ? i / 2 + 1 : i / 2;
		}
		for (int i = 0; i <= m; i++) {
			dp[1][i] = i % 2 == 1 ? i / 2 + 1 : i / 2;
		}
		int up = 0;
		int left = 0;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=m;j++) {
			}
		}*/
		int result = 0;
		if(m%2==0) {
			int first = m/2;
			result = first*n;
		}else {
			int first = m/2+1;
			int second = m/2;
			for(int i=1;i<=n;i++) {
				result+=i%2==1?first:second;
			}
		}
		
		return result;
	}
}
