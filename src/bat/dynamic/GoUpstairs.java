package bat.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * ��n��̨�ף�һ����ÿ����һ���������������ж���������n��̨�׵ķ�����Ϊ�˷�ֹ������뽫���Mod 1000000007
 * ����һ��������int n���뷵��һ������������¥�ķ�ʽ������֤nС�ڵ���100000��
 * ����������
 * 1
 * ���أ�1
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
     * �������,ջ�����
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
     * �������䷨ ջ��� java.lang.StackOverflowError
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
     * ��̬�滮��
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
