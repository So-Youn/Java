package chap02;
// �Է� ���� 10������ 2����~36������ �����ȯ�Ͽ� ���(��ȯ����)
import java.util.*;
public class CardConvEx_02 {
	// ���� x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �����ϰ� �ڸ����� ��ȯ
	static int cardConvEx(int x,int r,char[] d) {
		int n = ((Integer)x).toString().length();
		int digits = 0; //��ȯ ���� �ڸ� ��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(String.format("%%2d | %%%dd\n",n),r,x);
		do {
			System.out.printf("   +");
			for(int i=0;i<n+2;i++)
				System.out.print('-');
			System.out.println();
			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		}while(x!=0);
		for(int i=0; i<digits/2;i++) {
			char temp = d[i];
			d[i] = d[digits - i -1];
			d[digits - i -1] = temp;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no ; //��ȯ�ϰ��� �ϴ� ����
 		int cd ;  //���
 		int dno; // ��ȯ ���� �ڸ� �� 
 		int retry; // �ѹ� ��?
 		char[] cno = new char[32]; // ��ȯ ���� �� �ڸ��� �����ϴ� ���� �迭
 		
 		System.out.println("10������ ��� ��ȯ");
 		do {
 			do {
 				System.out.print("���� �ƴ� ���� :");
 				no = sc.nextInt();
 			}while(no <0);
 			
 			do {
 				System.out.print(" �� ������ ��ȯ ? (2~36)");
 				cd = sc.nextInt();
 			} while(cd <2||cd>36);
 			
 			dno = cardConvEx(no, cd, cno); // no�� cd ������ ��ȯ
 			
 			System.out.print(cd + "�����δ�");
 			
 			for(int i=0;i<dno;i++)
 				System.out.print(cno[i]);
 			System.out.println("�Դϴ�. ");
 			
 			System.out.print("�ѹ� �� �ұ�� ? ( 1.��/ 0. �ƴϿ�)");
 			retry = sc.nextInt();
 		} while(retry==1);
	}

}
