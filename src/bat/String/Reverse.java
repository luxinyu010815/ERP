package bat.String;

/**
 * ����һ���ַ����������һ���㷨��ֻ���ַ����ĵ��ʼ������������Ҳ����˵���ַ�����һЩ�ɿո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
 * ����һ��ԭ�ַ���A�����ĳ��ȣ��뷵���������ַ�����
 * ����������
 * "dog loves pig",13
 * ���أ�"pig loves dog"
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
