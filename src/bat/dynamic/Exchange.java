package bat.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * 有数组penny，penny中所有的值都为正数且不重复。每个值代表一种面值的货币，
 * 每种面值的货币可以使用任意张，再给定一个整数aim(小于等于1000)代表要找的钱数，求换钱有多少种方法。
 * 给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。 测试样例： [1,2,4],3,3 返回：2
 * 
 * @author luxin
 *
 */
public class Exchange {
	private static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int[] a = { 1, 2, 4 };
		//countWays(a, a.length, 5);
		System.out.println(countWays(a, a.length, 3));
	}

	public static int countWays(int[] penny, int n, int aim) {
		// write code here
		int result1 = getResult1(penny, 0, aim);
		int result2 = getResult2(penny, 0, aim);
		int result3 = getResult2(penny, 0, aim);
		int result4 = getResult2(penny, 0, aim);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		return result3;
	}

	/**
	 * 暴力求解法
	 * 
	 * @param penny
	 * @param n
	 * @param aim
	 * @return
	 */
	public static int getResult1(int[] penny, int n, int aim) {
		if (n >= penny.length)
			return 0;
		if (penny[n] > aim)
			return 0;
		if (penny[n] == aim)
			return 1;
		int result = 0;
		for (int i = 0; i * penny[n] <= aim; i++) {
			result += getResult1(penny, n + 1, aim - i * penny[n]);
			if (i * penny[n] == aim) {
				result += 1;
			}
		}
		return result;
	}

	/**
	 * 记忆搜索法
	 * 
	 * @return
	 */
	public static int getResult2(int[] penny, int n, int aim) {
		if (n >= penny.length)
			return 0;
		if (penny[n] > aim)
			return 0;
		if (penny[n] == aim)
			return 1;
		int result = 0;
		Integer num = map.get(penny[n] + " " + aim);
		if (num != null) {
			result = num;
		} else {
			for (int i = 0; i * penny[n] <= aim; i++) {
				result += getResult1(penny, n + 1, aim - i * penny[n]);
				if (i * penny[n] == aim) {
					result += 1;
				}
			}
		}
		return result;
	}
	/**
	 * 动态规划方法
	 * @param penny
	 * @param n
	 * @param aim
	 * @return
	 */
	public static int getResult3(int[] penny, int n, int aim) {
		int[][] result = new int[penny.length][aim + 1];
		for (int i = 0; i < aim + 1; i++) {
			result[0][i] = aim % penny[0] == 0 ? 1 : 0;
		}
		int J =0;
		int num = 0;
		for(int i=1;i<penny.length;i++) {
			for(int j=1;j<aim+1;j++) {
				J=j;
				num = 0;
				while(J-num*j>=0) {
					J = J-num*j;
					num++;
					result[i][j]+=result[i-1][J];
				}
			}
		}
		return result[penny.length][aim];
	}
	
	/**
	 * 动态规划方法再改进
	 * @param penny
	 * @param n
	 * @param aim
	 * @return
	 */
	public static int getResult4(int[] penny, int n, int aim) {
		int[][] result = new int[penny.length][aim + 1];
		for (int i = 0; i < aim + 1; i++) {
			result[0][i] = aim % penny[0] == 0 ? 1 : 0;
		}
		int J =0;
		int num = 0;
		for(int i=1;i<penny.length;i++) {
			for(int j=1;j<aim+1;j++) {
				result[i][j]+=result[i-1][j]+result[i][j-penny[i]];
			}
		}
		return result[penny.length][aim];
	}
}