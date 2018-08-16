package bat.String;

import org.junit.Test;

/**
 * �������ñ˴˶����Ķ�����A��B�����дһ����Ч�㷨�����A���Ƿ����һ��������B�������˽ṹ��ȫ��ͬ��
 * �������ö�������ͷ���A��B���뷵��һ��boolֵ������A���Ƿ����һ��ͬ����B��������
 * 
 * @author luxin
 *
 */
public class IdenticalTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(7);
		System.out.println(buildString(root));
	}

	public boolean chkIdentical(TreeNode A, TreeNode B) {
		// write code here
		String strA = buildString(A);
		String sreB = buildString(B);
		boolean flag = false;
		if (strA.indexOf(sreB) != -1) {
			flag = true;
		}
		return flag;
	}

	public static String buildString(TreeNode a) {
		String result = "";
		if (a == null)
			return "#!";
		result = result + a.val + "!";
		result += buildString(a.left);
		result += buildString(a.right);
		return result;
	}

	public boolean chkIdentical1(TreeNode A, TreeNode B) { // write code here
		String str1 = buildString(A);
		String str2 = buildString(B);
		boolean flag = true;
		if (str1.indexOf(str2) == -1) {
			flag = false;
		}
		return flag;
	}

	public static String buildString1(TreeNode a) {
		StringBuilder str = new StringBuilder();
		if (a == null)
			return "#!";
		str.append(a.val + "!");
		str.append(buildString(a.left));
		str.append(buildString(a.right));
		return str.toString();
	}

}
