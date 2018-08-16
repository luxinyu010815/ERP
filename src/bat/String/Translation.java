package bat.String;

/**
 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
 * 给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
 * 测试样例：
 * "ABCDE",5,3
 * 返回："DEABC"
 * @author luxin
 *
 */
public class Translation {
	public static void main(String[] args) {
		System.out.println(stringTranslation("abcde", 5, 2));
	}
    public static String stringTranslation(String A, int n, int len) {
        // write code here
    	String bre = A.substring(0, len );
    	String aft = A.substring(len);
    	return new StringBuilder().append(aft).append(bre).toString();
    }
}
