package bat.probability;

import java.util.Arrays;

/**
 * 有2k只球队，有k-1个强队，其余都是弱队，随机把它们分成k组比赛，每组两个队，问两强相遇的概率是多大？
 * 给定一个数k，请返回一个数组，其中有两个元素，分别为最终结果的分子和分母，请化成最简分数 测试样例： 4 返回：[3,7]
 * 
 * @author luxin
 *
 */
public class Championship {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(calc(2)));
	}
	public static int[] calc(int k) {
        // write code here
    	int[] result = {1,1};
    	for(int i=2*k-1;i>0;i-=2) {
    		result[1]*=i;
    	}
    	int temp = 1;
    	for(int i=k+1;i>k-1;i--) {
    		temp*=i;
    	}
    	for(int i=k+1-k+1;i>0;i--) {
    		temp/=i;
    	}
    	for(int i=k-1;i>0;i--) {
    		temp*=i;
    	}
    	result[0] = result[1]-temp;
    	if(result[0]==0) {
    		result[1] = 1;
    	}
    	for(int i=result[0];i>1;i--) {
    		if(result[0]%i==0&&result[1]%i==0) {
    			result[0] = result[0]/i;
    			result[1] = result[1]/i;
    			i=result[0];
    		}
    	}
    	
    	return result;
    }
}
