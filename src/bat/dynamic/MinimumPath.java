package bat.dynamic;

/**
 * ��һ������map����ÿ��������һ��Ȩֵ�������Ͻǵĸ��ӿ�ʼÿ��ֻ�����һ��������ߣ�
 * ��󵽴����½ǵ�λ�ã�·�������е������ۼ���������·���ͣ��������е�·������С��·���͡�
 * ����һ������map����������n������m���뷵����С·���͡���֤��������С�ڵ���100.
 * ����������
 * [[1,2,3],[1,1,1]],2,3
 * ���أ�4
 * @author luxin
 *
 */
public class MinimumPath {
	public static void main(String[] args) {
		int[][] map = {{1,2,3},{1,1,1}};
		System.out.println(getMin(map, 2, 3));
	}
    public static int getMin(int[][] map, int n, int m) {
        // write code here
    	int[][] result = map.clone();
    	for(int i=1;i<m;i++) {
    		result[0][i]+=result[0][i-1];
    	}
    	for(int i=1;i<n;i++) {
    		result[i][0]+=result[i-1][0];
    	}
    	for(int i=1;i<n;i++) {
    		for(int j=1;j<m;j++) {
    			result[i][j] += Math.min(result[i-1][j], result[i][j-1]);
    		}
    	}
    	return result[n-1][m-1];
    }
}
