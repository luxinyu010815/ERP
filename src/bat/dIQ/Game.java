package bat.dIQ;

/**
 * A��B����Ϸ�� ��һ��n*m�ľ����еĳ������ǣ�1��m�����յ��ǣ�n,1����������ֻ�������ƶ�һ������һ����������ƶ�һ�����ߵ��յ��Ϊwinner�� A���ߡ�
 * ������������n��m���뷵�����Ļ�ʤ�ߵ�����(A��B)��
 * ����������
 * 5 3
 * ���أ�B
 * @author luxin
 *
 */
public class Game {
    public char getWinner(int n, int m) {
        // write code here
    	if(n%2==1&&m%2==1) {
    		return 'B';
    	}else {
    		return 'A';
    	}
    }
}
