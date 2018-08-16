package bat.String;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 * 给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 * 测试样例：
 * ["abc","de"],2
 * "abcde"
 * @author luxin
 *
 */
public class Prior {
	public static void main(String[] args) {
		String[] strs = {"kid","yqt","i","k"};
		System.out.println(findSmallest(strs, 4));
	}
	public static String findSmallest(String[] strs, int n) {
        // write code here
		Arrays.sort(strs, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int result = 0;
				int flag = (o1+o2).compareTo(o2+o1);
				if(flag>0) {
					result = 1;
				}else if(flag==0) {
					result = 0;
				}else {
					result = -1;
				}
				return result;
			}
		});
		StringBuilder str = new StringBuilder();
		for (String s : strs) {
			str.append(s);
		}
		return str.toString();
    }
    /*public static String findSmallest(String[] strs, int n) {
        // write code here
    	int minIndex =0;
    	String temp = "";
    	for(int i=0;i<n;i++) {
    		minIndex = i;
    		for(int j=i;j<n;j++) {
    			if(sort(strs[minIndex], strs[j])==strs[j]) {
    				minIndex = j;
    			}
    		}
    		temp = strs[i];
    		strs[i] = strs[minIndex];
    		strs[minIndex] = temp;
    	}
    	StringBuilder stringBuilder = new StringBuilder();
    	for(int i=0;i<n;i++) {
    		stringBuilder.append(strs[i]);
    	}
    	return stringBuilder.toString();
    }
    public static String sort(String a,String b) {
    	return (a+b).compareTo(b+a)<0?a:b;
    }*/
}
