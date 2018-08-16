package bat.String;

/**
 * ����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
 * ����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
 * ����������
 * "(()())",6
 * ���أ�true
 * ����������
 * "()a()()",7
 * ���أ�false
 * ����������
 * "()(()()",7
 * ���أ�false
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
