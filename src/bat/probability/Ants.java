package bat.probability;

/**
 *  ��3�� ����ϰ�� 
 * nֻ���ϴ���n���ε�n���������ű��ƶ����ٶ�����ͬ�ģ���������ͷ�ĸ����Ƕ��٣�
 * ����һ��������n���뷵��һ�����飬��������Ԫ�طֱ�Ϊ����ķ��Ӻͷ�ĸ���뻯Ϊ��������
 * ����������
 * 3
 * ���أ�[3,4]
 * @author luxin
 *
 */
public class Ants {
    public int[] collision(int n) {
        // write code here
    	int[] result = {1,1};
    	result[1] = (int) Math.pow(2, n);
    	result[0] = result[1]-2;
    	for(int i=result[0];i>1;i--) {
    		if(result[0]%i==0&&result[1]%i==0) {
    			result[0] = result[0]/i;
    			result[1] = result[1]/i;
    			i = result[0];
    		}
    	}
    	return result;
    }
}
