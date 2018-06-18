package bat.dynamic;

/**
 * ���������ַ���A��B�����������ַ���������������еĳ��ȡ����磬A="1A2C3D4B56����B="B1D23CA45B6A������123456"����"12C4B6"��������������С�
 * ���������ַ���A��B��ͬʱ�����������ĳ���n��m���뷵������������еĳ��ȡ���֤�������Ⱦ�С�ڵ���300��
 * ����������
 * "1A2C3D4B56",10,"B1D23CA45B6A",12
 * ���أ�6
 * @author luxin
 *
 */
public class LCS {
	public static void main(String[] args) {
		String A = "joneoovzzmuispkgmnhqgdmbchdntanbofhcwftcdnbsyvcragunnopknzazjqoprujqfiesoreslzvgzaed";
		String B = "oynwkodiovsvkliehbvvggpdydesncaentayeufhoaaildsdwkfpnvxwpsqcujtssriiudgyxstiefyvsp";
		System.out.println(findLCS(A, 84, B, 82));
	}
    public static int findLCS(String A, int n, String B, int m) {
        // write code here
    	int[][] dp = new int[n][m];
    	for(int i=0;i<n;i++) {
    		if(A.charAt(i)==B.charAt(0)) {
    			while(i<n) {
    				dp[i][0] = 1;
    				i++;
    			}
    		}
    	}
    	for(int i=0;i<m;i++) {
    		if(A.charAt(0)==B.charAt(i)) {
    			while(i<m) {
    				dp[0][i] = 1;
    				i++;
    			}
    		}
    	}
    	for(int i=1;i<n;i++) {
    		for(int j=1;j<m;j++) {
    			if(A.charAt(i)==B.charAt(j)) {
    				dp[i][j] = Math.max(dp[i][j-1]>dp[i-1][j]?dp[i][j-1]:dp[i-1][j], dp[i-1][j-1]+1);
    			}else {
    				dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
    			}
    		}
    	}
    	return dp[n-1][m-1];
    }
}
