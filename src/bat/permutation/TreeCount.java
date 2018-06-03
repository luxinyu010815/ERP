package bat.permutation;

public class TreeCount {
    public int countWays(int n) {
        // write code here
    	int result = 1;
    	for(int i=2*n;i>n;i--) {
    		result*=n;
    	}
    	for(int i=n;i>0;i--) {
    		result/=i;
    	}
    	
    	return result/(n+1);
    }
}