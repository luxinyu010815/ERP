package bat.dIQ;

/**
 * ��Ҫ��һ��nxm�ĸ���ͼ��Ϳɫ����ÿ�ο���ѡ��һ��δͿɫ�ĸ���Ϳ���㿪ʼѡ����������ɫ��ͬʱΪ�����ۣ�����Ҫ����Ϳɫ�ĸ��Ӳ������ڣ�Ҳ����˵�������й����ߣ��������㣬�ڲ�ȡ���Ų��Ե�����£��������Ϳ���ٸ����ӣ�
 * ��������ͼ�ĳ�n�Ϳ�m���뷵�������Ϳ�ĸ�����Ŀ�� ���������� 1,2 ���أ�1
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
