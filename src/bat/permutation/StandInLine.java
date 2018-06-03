package bat.permutation;

/**
 * n����վ�ӣ����ǵı�����δ�1��n��Ҫ����Ϊa���˱����ڱ��Ϊb���˵���ߣ�����Ҫ��һ�����ڣ����ʹ��ж������ŷ���
 * �ڶ������Ҫ��a������b����ߣ�����һ��Ҫ���ڣ�����һ���ж������ŷ���
 * ��������n�������˵ı��a��b���뷵��һ������Ԫ�ص����飬��������Ԫ������Ϊ��������Ĵ𰸡���֤����С�ڵ���10��
 * ����������
 * 7,1,2
 * ���أ�[2520,720]
 * @author luxin
 *
 */
public class StandInLine {
    public int[] getWays(int n, int a, int b) {
        // write code here
    	int num = 1;
    	int[] result = new int[2];
    	for(int i=n;i>0;i--) {
    		num*=i;
    	}
    	result[0] = num/2;
    	result[1] = num/n;
    	return result;
    }
}
