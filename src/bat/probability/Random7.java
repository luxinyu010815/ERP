package bat.probability;

import java.util.Random;

/**
 * ����һ���ȸ����������1~5����������� ����֮�⣬����ʹ���κζ����������ƣ���ʵ�ֵȸ����������1~7�����������
 * (����һ���ɵ��õ�Random5::random()����,���Եȸ��ʵ��������1��5���������)
 * 
 * @author luxin
 *
 */
public class Random7 {
	private static Random rand = new Random(123456);
	// �������[1,5]
	private static int rand5() {
		return 1 + rand.nextInt(5);
	}

	// ͨ��rand5ʵ��rand7
	public static int randomNumber() {
		int temp = 0;
		while (true) {
			temp = (rand5() - 1) * 5 + rand5()-1;
			if(temp<21) {
				return temp%7+1;
			}
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<70;i++) {
			System.out.println(randomNumber());
		}
	}
}
