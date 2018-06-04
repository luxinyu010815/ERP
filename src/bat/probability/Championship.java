package bat.probability;

import java.util.Arrays;

/**
 * ��2kֻ��ӣ���k-1��ǿ�ӣ����඼�����ӣ���������Ƿֳ�k�������ÿ�������ӣ�����ǿ�����ĸ����Ƕ��
 * ����һ����k���뷵��һ�����飬����������Ԫ�أ��ֱ�Ϊ���ս���ķ��Ӻͷ�ĸ���뻯�������� ���������� 4 ���أ�[3,7]
 * 
 * @author luxin
 *
 */
public class Championship {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(calc(2)));
	}
	public static int[] calc(int k) {
        // write code here
    	int[] result = {1,1};
    	for(int i=2*k-1;i>0;i-=2) {
    		result[1]*=i;
    	}
    	int temp = 1;
    	for(int i=k+1;i>k-1;i--) {
    		temp*=i;
    	}
    	for(int i=k+1-k+1;i>0;i--) {
    		temp/=i;
    	}
    	for(int i=k-1;i>0;i--) {
    		temp*=i;
    	}
    	result[0] = result[1]-temp;
    	if(result[0]==0) {
    		result[1] = 1;
    	}
    	for(int i=result[0];i>1;i--) {
    		if(result[0]%i==0&&result[1]%i==0) {
    			result[0] = result[0]/i;
    			result[1] = result[1]/i;
    			i=result[0];
    		}
    	}
    	
    	return result;
    }
}
