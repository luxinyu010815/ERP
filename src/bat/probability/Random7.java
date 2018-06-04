package bat.probability;

import java.util.Random;

/**
 * 给定一个等概率随机产生1~5的随机函数， 除此之外，不能使用任何额外的随机机制，请实现等概率随机产生1~7的随机函数。
 * (给定一个可调用的Random5::random()方法,可以等概率地随机产生1～5的随机函数)
 * 
 * @author luxin
 *
 */
public class Random7 {
	private static Random rand = new Random(123456);
	// 随机产生[1,5]
	private static int rand5() {
		return 1 + rand.nextInt(5);
	}

	// 通过rand5实现rand7
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
