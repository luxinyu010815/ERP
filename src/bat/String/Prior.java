package bat.String;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ����һ���������ַ������飬���ҵ�һ��ƴ��˳��ʹ����С�ַ���ƴ�ӳɵĴ��ַ��������п��ܵ�ƴ�����ֵ�����С�ġ�
 * ����һ���ַ�������strs��ͬʱ�������Ĵ�С���뷵��ƴ�ӳɵĴ���
 * ����������
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
