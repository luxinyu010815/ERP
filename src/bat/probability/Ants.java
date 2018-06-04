package bat.probability;

/**
 *  第3节 蚂蚁习题 
 * n只蚂蚁从正n边形的n个定点沿着边移动，速度是相同的，问它们碰头的概率是多少？
 * 给定一个正整数n，请返回一个数组，其中两个元素分别为结果的分子和分母，请化为最简分数。
 * 测试样例：
 * 3
 * 返回：[3,4]
 * @author luxin
 *
 */
public class Ants {
    public int[] collision(int n) {
        // write code here
    	int[] result = {1,1};
    	result[1] = (int) Math.pow(2, n);
    	result[0] = result[1]-2;
    	for(int i=result[0];i>1;i--) {
    		if(result[0]%i==0&&result[1]%i==0) {
    			result[0] = result[0]/i;
    			result[1] = result[1]/i;
    			i = result[0];
    		}
    	}
    	return result;
    }
}
