package bat.dynamic;

/**
 * ���������ַ���A��B��������Ҫ���в��롢ɾ�����޸Ĳ�����A����ΪB��������c0��c1��c2�ֱ�Ϊ���ֲ����Ĵ��ۣ������һ����Ч�㷨�������A����ΪB������Ҫ�����ٴ��ۡ�
 * ���������ַ���A��B�������ǵĳ��Ⱥ����ֲ������ۣ��뷵�ؽ�A����ΪB������Ҫ����С���ۡ���֤�������Ⱦ�С�ڵ���300�������ִ���ֵ��С�ڵ���100��
 * ����������
 * "abc",3,"adc",3,5,3,100
 * ���أ�8
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
