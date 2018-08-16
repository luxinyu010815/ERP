package bat.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
 * 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 * 测试样例：
 * "abc",3,"bca",3
 * 返回：true
 * @author luxin
 *
 */
public class Transform {
	public static void main(String[] args) {
		System.out.println(chkTransform("aba", 3, "abc", 3));
		System.out.println(chkTransform("aba", 3, "baa", 3));
		System.out.println(chkTransform("aba", 3, "abcd", 4));
	}
	
	public static boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
		char[] strA = A.toCharArray();
		char[] strB = B.toCharArray();
		Map<Character, Integer> mapA = new HashMap<>();
		for(int i=0;i<strA.length;i++) {
			if(mapA.get(strA[i])!=null) {
				mapA.put(strA[i], mapA.get(strA[i])+1);
			}else {
				mapA.put(strA[i], 1);
			}
		}
		Map<Character, Integer> mapB = new HashMap<>();
		for(int i=0;i<strB.length;i++) {
			if(mapB.get(strB[i])!=null) {
				mapB.put(strB[i], mapB.get(strB[i])+1);
			}else {
				mapB.put(strB[i], 1);
			}
		}
		Set<Character> keySet = mapB.keySet();
		boolean flag = true;
		for (Character character : keySet) {
			if(mapA.get(character)!=mapB.get(character)) {
				flag = false;
				break;
			}
		}
    	return flag;
    }
    /*public static boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
    	if(lena!=lenb) return false;
    	char[] aArr = A.toCharArray();
    	char[] bArr = B.toCharArray();
    	HashMap<Character,Integer> aMap = new HashMap<>();
    	HashMap<Character,Integer> bMap = new HashMap<>();
    	for(int i=0;i<lena;i++) {
    		if(aMap.get(aArr[i])!=null) {
    			aMap.put(aArr[i], aMap.get(aArr[i])+1);
    		}else {
    			aMap.put(aArr[i], 1);
    		}
    	}
    	for(int i=0;i<lenb;i++) {
    		if(bMap.get(bArr[i])!=null) {
    			bMap.put(bArr[i], bMap.get(bArr[i])+1);
    		}else {
    			bMap.put(bArr[i], 1);
    		}
    	}
    	
    	Set< Character> aKey = aMap.keySet();
    	for (Character key : aKey) {
			if(aMap.get(key)==bMap.get(key)) {
				bMap.remove(key);
			}else {
				return false;
			}
		}
    	if(bMap.size()!=0) {
    		return false;
    	}else{
    		return true;
    	}
    }*/
}
