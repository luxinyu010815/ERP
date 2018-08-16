package bat.String;

import java.util.HashMap;
import java.util.Map;

/**
 * ����һ���ַ���,�����һ����Ч�㷨���ҵ��ַ���������ظ��ַ����Ӵ����ȡ�
 * ����һ���ַ���A�����ĳ���n���뷵����������ظ��ַ��Ӵ����ȡ���֤A���ַ�ȫ��ΪСдӢ���ַ����ҳ���С�ڵ���500�� ���������� "aabcb",5
 * ���أ�3
 * 
 * @author luxin
 *
 */
public class DistinctSubstring {
	public static void main(String[] args) {
		System.out.println(longestSubstring("aabaa", 5));
	}

	public static int longestSubstring(String A, int n) {
		// write code here
		Map<Character, Integer> map = new HashMap<>();
		char[] cArr = A.toCharArray();
		int pre = 0;
		int maxLength = 0;
		Integer preIndex;
		for (int i = 0; i < n; i++) {
			preIndex = map.get(cArr[i]);
			if (preIndex != null && preIndex >= pre) {
				pre = preIndex + 1;
			}
			maxLength = Math.max(maxLength, i - pre + 1);

			map.put(cArr[i], i);
		}
		return maxLength;
	}

	public static int longestSubstring1(String A, int n) {
		Map<Character, Integer> map = new HashMap<>();
		int pre = 0;
		int maxValue = 0;
		char currentChar = ' ';
		int preIndex = 0;
		Integer beforIndex = 0;
		for (int i = 0; i < n; i++) {
			currentChar = A.charAt(i);
			preIndex = i - pre;
			beforIndex = map.get(currentChar);
			if (beforIndex == null) {
				beforIndex = 0;
				map.put(currentChar, i);
			} else {
				beforIndex++;
				map.put(currentChar, i);
			}
			if (preIndex >= beforIndex) {
				pre++;
			} else if (preIndex < beforIndex) {
				pre = i - beforIndex + 1;
			}

			maxValue = Math.max(maxValue, pre);
		}
		return maxValue;
	}

}
