package bat.permutation;

/**
 * ��XxY�ķ����У������ϽǸ���Ϊ��㣬���½Ǹ���Ϊ�յ㣬ÿ��ֻ�������߻��������ߣ�����һ���ж����ֲ�ͬ���߷� ��������������int x,int
 * y���뷵���߷���Ŀ����֤x��yС�ڵ���12�� ���������� 2,2 ���أ�2
 * 
 * @author luxin
 *
 */
public class Robot {
	public static void main(String[] args) {
		System.out.println(countWays(2, 2));
	}

	public static int countWays(int x, int y) {
		x--;
		y--;
		// write code here
		int result = 1;
		for (int i = x + y; i > x; i--) {
			result *= i;
		}

		for (int i = y; i > 0; i--) {
			result /= i;
		}
		return result;
	}
}
