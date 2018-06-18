package bat.dIQ;

import java.util.Arrays;

/**
 * 作为一个马场的主人，你要安排你的n匹赛马和另一个马场的n匹马比赛。你已经知道了对方马场的出战表，即参加每一场的马的强壮程度。
 * 当然你也知道你自己的所有马的强壮程度。我们假定比赛的结果直接由马的强壮程度决定，即更壮的马获胜(若相同则双方均不算获胜)，请你设计一个策略，使你能获得尽量多的场次的胜利。
 * 给定对方每场比赛的马的强壮程度oppo及你的所有马的强壮程度horses(强壮程度为整数，且数字越大越强壮)同时给定n，请返回最多能获胜的场次。
 * 测试样例：
 * [1,2,3],[1,2,3],3
 * 返回：2
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
