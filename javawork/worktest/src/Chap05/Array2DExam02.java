package Chap05;
//��ũ�� 21page
public class Array2DExam02 {

	public static void main(String[] args) {
		int[][] arr2= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total=0;
		double average = 0.0;
		int count=0;
		for(int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				total = total + arr2[j][i];
				count++;
			}
		}
		System.out.println("total=>"+total+",count=>"+count);
		average = (double)total/count;
		//average = (double)total/(arr2.length*arr2[0].length);
		System.out.println("average=>"+average);
	}

}
