package Chap05;

/*
 * 2�����迭 ����
 * 1  2  3  4  5
 * 6  7  8  9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * *  2   3  4  5
 * 6  *   8  9 10
 * 11 12 *  14 15
 * 16 17 18 *  20
 * 21 22 23 24  *
 */
public class Array2DExam01 {
	// �����迭
	public static void main(String[] args) {
			// 1.2�����迭 ����
		int[][] myarr = new int[5][5];
			//2.2���� �迭�� �� ���� - Setting
		int c =1;
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				myarr[i][j] = c;
				c++;
			}
		}
		//3.2���� �迭�� ����� �����͸� ������¿� ���� ����ϱ�
		for(int i=0;i<myarr.length;i++) {
			for(int j=0; j<myarr[i].length;j++) {
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println( );
		}
		System.out.println("=====================================");
		
		for(int i=0;i<myarr.length;i++) {
			for(int j=0; j<myarr[i].length;j++) {
				if (i==j) {
					
					System.out.print("*"+"\t");
				} else {
				System.out.print(myarr[i][j]+"\t");
				}
			}
			System.out.println( );
		}	

	}
}