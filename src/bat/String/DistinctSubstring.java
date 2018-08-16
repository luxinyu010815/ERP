package bat.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 对于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
 * 给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。保证A中字符全部为小写英文字符，且长度小于等于500。 测试样例： "aabcb",5
 * 返回：3
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
