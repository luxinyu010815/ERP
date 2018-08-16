package bat.String;

/**
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false
 * @author luxin
 *
 */
public class Parenthesis {
	public static void main(String[] args) {
		String A = "()(()()";
		System.out.println(chkParenthesis("(()())",6));
	}
	public static boolean chkParenthesis(String A, int n) {
        // write code here
		char[] charArray = A.toCharArray();
    	boolean flag = true;
    	int num = 0;
    	for(int i=0;i<n;i++) {
    		if(num<0) {
    			flag = false;
    			break;
    		}
    		if(charArray[i]=='(')num++;
    		if(charArray[i]==')') num--;
    	}
    	if(num!=0) flag = false;
    	return flag;
    }
    /*public boolean chkParenthesis(String A, int n) {
        // write code here
    	if(n%2!=0)return false;
    	int num=0;
    	for(int i=0;i<n;i++) {
    		if(n<0)return false;
    		if(A.charAt(i)=='(') {
    			num++;
    		}else if(A.charAt(i)==')'){
    			num--;
    		}
    	}
    	if(num==0) {
    		return true;
    	}else {
    		return false;
    	}
    }*/
}
