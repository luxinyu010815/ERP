package bat.probability;

import java.util.Random;

/**
 * ����һ����p���ʲ���0����1-p���ʲ���1���������RandomP::f()��
 * p�ǹ̶���ֵ�����㲢��֪���Ƕ��١�����֮��Ҳ����ʹ���κζ����������ƣ�
 * ����RandomP::f()ʵ�ֵȸ����������0��1�����������
 * @author luxin
 *
 */
public class Random01 {
    private static double p = new Random().nextFloat();
    // �������p
    public static int f() {
        return new Random().nextFloat() < p ? 0 : 1;
    }

    public int random01() {
        // ͨ��f����ʵ��01�ȸ��ʷ���
    	int p1 = f();
    	int p2 = f();
    	int result = -1;
    	while(p1+p2!=1) {
    		p1 = f();
    		p2 = f();
    	}
    	if(p1==0&&p2==1) {
    		result = 1;
    	}else if(p1==1&&p2==0) {
    		result = 0;
    	}
        return result;
    }
}
