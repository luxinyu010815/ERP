package bat.String;

/**
 * ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�
 * ����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
 * ����������
 * "Mr John Smith��,13
 * ���أ�"Mr%20John%20Smith"
 * ��Hello  World��,12
 * ���أ���Hello%20%20World��
 * @author luxin
 *
 */
public class Replacement {
	public static void main(String[] args) {
		String iniString = "Hello  World";
		System.out.println(replaceSpace(iniString, 12));
	}
	public static String replaceSpace(String iniString, int length) {
        // write code here
		String replace = iniString.replace(" ", "%20");
    	return replace;
    }
    /*public String replaceSpace(String iniString, int length) {
        // write code here
    	char[] a = iniString.toCharArray();
    	StringBuilder str = new StringBuilder();
    	for (char c : a) {
			if(c!=' ') {
				str.append(c);
			}else {
				str.append("%20");
			}
		}
    	return str.toString();
    }*/
}
