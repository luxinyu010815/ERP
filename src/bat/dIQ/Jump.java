package bat.dIQ;

/**
 * �������������������������ӵ���Ϸ����������һ����n��������ɵĳ������������������ƶ�һ�����ӣ�ÿ�ο���ѡ����������1-3���Ƚ������Ƴ����̵��˻��ʤ����
 * ����֪���������˶����ȡ���Ų��ԣ�������֪������Ŀ�����ҳ�ʼʱ�����ڵ�һ���������������������Ƿ��ܻ�ʤ��
 * �������ӵ���Ŀn(nΪ������300��������)������һ��������1�����ܻ�ʤ��0�������ܻ�ʤ��
 * ����������
 * 3
 * ���أ�1
 * @author luxin
 *
 */
public class Jump {
    public int checkWin(int n) {
        // write code here
    	return (n-1)%4==0?0:1;
    }
}