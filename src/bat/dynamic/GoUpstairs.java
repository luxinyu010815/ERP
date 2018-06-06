package bat.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * 有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。为了防止溢出，请将结果Mod 1000000007
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 * 测试样例：
 * 1
 * 返回：1
 * @author luxin
 *
 */
public class GoUpstairs {
	public static void main(String[] args) {
		countWays(3);
		countWays(100000);
		//System.out.println(countWays(100000));
		
	}
    public static int countWays(int n) {
        // write code here
    	/*int result1 = getResult1(n); 
    	System.out.println(result1);*/
    	
    	/*int result2 = getResult2(n); 
    	System.out.println(result2);*/
    	
    	int result3 = getResult3(n); 
    	System.out.println(result3);
    	return result3;
    }
    private static Map<Integer, Integer> map = new HashMap<>();
    /**j
     * 暴力求解,栈会溢出
     * @return
     */
    public static int getResult1(int n) {
    	if(n==1) return 1;
    	if(n==2) return 2;
    	/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	return getResult1(n-1)+getResult1(n-2);
    }
    
    /**
     * 搜索记忆法 栈溢出 java.lang.StackOverflowError
     * @param n
     * @return
     */
    public static int getResult2(int n) {
    	if(n==1) return 1;
    	if(n==2) return 2;
    	Integer num = map.get(n);
    	if(num==null) {
    		num = getResult2(n-1)+getResult2(n-2);
    		return num;
    	}
    	return num;
    }
    
    /**
     * 动态规划法
     * @return
     */
    public static int getResult3(int n) {
    	int[] result = new int[n+1];
    	result[0] = 0;
    	result[1] = 1;
    	result[2] = 2;
    	for(int i=3;i<=n;i++) {
    		result[i] = result[i-1]+result[i-2];
    	}
    	return result[n];
    }
}
