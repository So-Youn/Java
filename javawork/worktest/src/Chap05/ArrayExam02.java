package Chap05;
//workbook 8��
public class ArrayExam02 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int arrsum = 0;				//���� ����
		for (int i=0;i<arr.length;i++) {
			arrsum = arrsum+ arr[i];
			
		}
			
		System.out.println("sum=" +arrsum);
		System.out.println("avg=" +(arrsum/arr.length));

	}

}
