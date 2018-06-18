package bat.dIQ;

import java.util.Arrays;

/**
 * ��Ϊһ���������ˣ���Ҫ�������nƥ�������һ������nƥ����������Ѿ�֪���˶Է����ĳ�ս�����μ�ÿһ�������ǿ׳�̶ȡ�
 * ��Ȼ��Ҳ֪�����Լ����������ǿ׳�̶ȡ����Ǽٶ������Ľ��ֱ�������ǿ׳�̶Ⱦ���������׳�����ʤ(����ͬ��˫���������ʤ)���������һ�����ԣ�ʹ���ܻ�þ�����ĳ��ε�ʤ����
 * �����Է�ÿ�����������ǿ׳�̶�oppo������������ǿ׳�̶�horses(ǿ׳�̶�Ϊ������������Խ��Խǿ׳)ͬʱ����n���뷵������ܻ�ʤ�ĳ��Ρ�
 * ����������
 * [1,2,3],[1,2,3],3
 * ���أ�2
 * @author luxin
 *
 */
public class HorseRace {
	public static void main(String[] args) throws InterruptedException {
		int[] oppo = new int[] {1,2,3,45,2,5,43,6,45,765,768,665,53};
		int[] horses = new int[] {1,2,333,4,565,47,22,865,3,578,433,45,32};
		System.out.println(winMost(oppo, horses, 13));
	}
    public static int winMost(int[] oppo, int[] horses, int n) throws InterruptedException {
        // write code here
    	Arrays.sort(oppo);
    	Arrays.sort(horses);
    	int num = 0;
    	for(int i=0;i<n;i++) {
    		if(horses[i]<=oppo[i-num]) {
    			num++;
    		}
    	}
    	return n-num;
    }
}
