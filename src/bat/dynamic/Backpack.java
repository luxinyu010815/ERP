package bat.dynamic;

/**
 * һ��������һ���ĳ���cap����N����Ʒ��ÿ�������Լ��ļ�ֵ����¼������v�У�
 * Ҳ�����Լ�����������¼������w�У�ÿ����Ʒֻ��ѡ��Ҫװ�뱳�����ǲ�װ�뱳����
 * Ҫ���ڲ������������ص�ǰ���£�ѡ����Ʒ���ܼ�ֵ���
 * ������Ʒ������w��ֵv����Ʒ��n�ͳ���cap���뷵������ܼ�ֵ��
 * ����������
 * [1,2,3],[1,2,3],3,6
 * [17,34,38,42,36],[335,406,160,452,311],5,90
 * ���أ�6
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
    	//ǰi����Ʒ������Ϊj��ʱ������ֵ
    	int[][] dp = new int[n+1][cap+1];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=cap;j++) {
    			//�����������1.��i����Ʒ���롣2.��i����Ʒ�����롣
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
