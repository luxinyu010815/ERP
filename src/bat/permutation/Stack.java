package bat.permutation;

/**
 * n��������ջ��˳���ж����֣�����ջ���������޴�
 * ����һ������n���뷵������Ľ���ջ˳���������֤�����int��Χ�ڡ�������п���������ʽ
 * ����������
 * 1
 * ���أ�1
 * @author luxin
 *
 */
public class Stack {
    public int countWays(int n) {
        // write code here
    	int result = 1;
    	for(int i=2*n;i>n;i--) {
    		result*=i;
    	}
    	
    	for(int i=n;i>0;i--) {
    		result/=i;
    	}
    	
    	return result/(n+1);
    }
}
