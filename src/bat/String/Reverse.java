package bat.String;

/**
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 * 测试样例：
 * "dog loves pig",13
 * 返回："pig loves dog"
 * @author luxin
 *
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverseSentence("hello my world!", 15));
	}
	public static String reverseSentence(String A, int n) {
        // write code here
    	String[] split = A.split(" ");
    	StringBuilder str = new StringBuilder();
    	for(int i=split.length-1;i>0;i--) {
    		str.append(split[i]+" ");
    		
    	}
    	str.append(split[0]);
    	return str.toString();
    }
    /*public static String reverseSentence(String A, int n) {
        // write code here
    	A = exchange(A);
    	String[] split = A.split(" ");
    	int i=0;
    	StringBuilder result = new StringBuilder();
    	for (String string : split) {
			result.append(exchange(string));
			if(i<split.length-1)result.append(" ");
			i++;
		}
    	return result.toString();
    }
    
    public static String exchange(String a) {
    	int first = 0;
    	int last = a.length()-1;
    	char[] cArr = a.toCharArray();
    	char temp = ' ';
    	while(first<last) {
    		temp = cArr[first];
    		cArr[first++] = cArr[last];
    		cArr[last--] = temp;
    	}
    	return new String(cArr);
    }*/
}
