package Chap05;
//2�����迭�� ����� ������ �ʱ�ȭ�ϱ�
public class Array2DTest03 {
	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				};	//int[][] myarr = new int[3][5]
		int[][] myarr2 = {
				{1,2,3},
				{6,7,8,9},
				{11,12,13,14,15},
				};	//int[][] myarr = new int[3][]
		//myarr�� myarr2�� �迭�� �迭�� ����� ���� ����ϱ�
		for(int j=0;j<myarr.length;j++) {
			for(int i=0;i<myarr[j].length;i++) {
				System.out.print(myarr[j][i]+"\t");
				}
			System.out.println( );
			}
		for(int j=0;j<myarr2.length;j++) {
			for(int i=0;i<myarr2[j].length;i++) {
				System.out.print(myarr2[j][i]+"\t");
				}
			System.out.println( );
			}
	}

}

