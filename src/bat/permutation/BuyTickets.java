package bat.permutation;

/**
 * 2n�����Ŷ���Ʊ��n������5��Ǯ��n������10��Ǯ��Ʊ����5��Ǯ1�ţ�ÿ������һ��Ʊ����ƱԱ����û����Ǯ�����ж������Ŷӷ�������ƱԱ����˳����Ʊ��
 * ����һ������n���뷵��������Ŷӷ�����������֤�����int��Χ�ڡ�����������ʽ
 * ����������
 * 1
 * ���أ�1
 * @author luxin
 *
 */
public class BuyTickets {
    public int countWays(int n) {
        // write code here
    	int reult = 1;
    	for(int i=2*n;i>n;i--) {
    		reult*=i;
    	}
    	
    	for(int i=n;i>0;i--) {
    		reult/=i;
    	}
    	
    	return reult/(n+1);
    }
}
