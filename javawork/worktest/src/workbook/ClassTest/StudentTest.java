package workbook.ClassTest;

public class StudentTest {
	public static void main(String[] args) {
		double ageAvg = 0.0;
		double heiAvg = 0.0;
		double weiAvg = 0.0;
		Students[] studentArr = new Students[3]; 
		studentArr[0] = new Students("ȫ�浿",15,171,81);
		studentArr[1] = new Students("�ѻ��",13,183,72);
		studentArr[2] = new Students("�Ӱ���",16,175,65);
		
		System.out.println("�̸� \t����\t����\t������");
		for (int i = 0; i < studentArr.length; i++) {
			studentArr[i].print();
		}
		System.out.println( );
		
		ageAvg = (double)(studentArr[0].getAge()+studentArr[1].getAge()+studentArr[2].getAge())/studentArr.length;
		heiAvg = (double)(studentArr[0].getHeight()+studentArr[1].getHeight()+studentArr[2].getHeight())/studentArr.length;
		weiAvg = (double)(studentArr[0].getWeigt()+studentArr[1].getWeigt()+studentArr[2].getWeigt())/studentArr.length;
		System.out.println("������ ��� : "+ageAvg);
		System.out.println("������ ���: "+heiAvg);
		System.out.println("�������� ���: "+weiAvg);
	}

}
