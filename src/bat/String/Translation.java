package bat.String;

/**
 * ����һ���ַ����������һ���㷨�����ַ����ĳ���Ϊlen��ǰ׺ƽ�Ƶ��ַ��������
 * ����һ���ַ���A�����ĳ��ȣ�ͬʱ����len���뷵��ƽ�ƺ���ַ�����
 * ����������
 * "ABCDE",5,3
 * ���أ�"DEABC"
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
