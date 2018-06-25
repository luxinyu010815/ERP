package bat.Sort;

public class Finder {
	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		mat[0] = new int[]{1,2,3};
		mat[1] = new int[]{4,5,6};
		mat[2] = new int[]{7,8,9};
		System.out.println(findX(mat, 3, 3, 1));
	}
	public static boolean findX(int[][] mat, int n, int m, int x) {
        // write code here
		int i = 0;
		int j = m-1;
		boolean flag = false;
		while(i<n&&j>=0) {
			if(x>mat[i][j]) {
				i++;
			}else if(x<mat[i][j]) {
				j--;
			}else {
				flag = true;
				break;
			}
		}
		return flag;
    }
	/*public static boolean findX(int[][] mat, int n, int m, int x) {
        // write code here
		int i=0;
		int j=m-1;
		boolean flag = false;
		while(i>=0&&i<n&&j>=0&&j<m) {
			if(x==mat[i][j]) {
				return true;
			}else if(x>mat[i][j]) {
				i++;
			}else {
				j--;
			}
		}
		return flag;
    }*/
}
