package bat.permutation;

/**
 * 在XxY的方格中，以左上角格子为起点，右下角格子为终点，每次只能向下走或者向右走，请问一共有多少种不同的走法 给定两个正整数int x,int
 * y，请返回走法数目。保证x＋y小于等于12。 测试样例： 2,2 返回：2
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
