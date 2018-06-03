package bat.permutation;

public class CombineByMistake {
	final static int Mod = 1000000007;
    public int countWays(int n) {
        // write code here
        return f(n);
    }
      
    public int f(int n) {
    	if(n == 1) return 0;
		else if(n == 2) return 1;
		else{
			int pre = 0,last = 1;
			for(int i = 3;i <= n;++ i){
				int tmp = (i - 1) * (pre + last) % Mod;
				pre = last; last = tmp;
			}
			return last;
		}
    }
}
