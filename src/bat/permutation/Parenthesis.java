package bat.permutation;

/**
 * ������n���������ţ�������Ϸ��������ж��ٸ����Ϸ���ָÿһ�����Ŷ������ҵ���֮��Ե����ţ�����n=1ʱ��()�ǺϷ��ģ�����)(Ϊ���Ϸ���
 * ����һ������n���뷵������ĺϷ�����������֤�����int��Χ�ڡ�
 * ����������
 * 1
 * ���أ�1
 * @author luxin
 *
 */
public class Parenthesis {
    public int countLegalWays(int n) {
        // write code here
    	int result = 1;
    	for(int i=2*n;i>n;i--) {
    		result*=i;
    	}
    	for(int i=1;i<=n;i++) {
    		result/=i;
    	}
    	return result/(n+1);
    }
}
