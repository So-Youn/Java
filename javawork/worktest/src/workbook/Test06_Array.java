package workbook;

public class Test06_Array{

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student();
		studentArr[0].setName("Kim");
		studentArr[0].setKor(100);
		studentArr[0].setEng(90);
		studentArr[0].setMat(95);
		studentArr[0].setSci(89);
		
		studentArr[1] = new Student();
		studentArr[1].setName("Lee");
		studentArr[1].setKor(60);
		studentArr[1].setEng(70);
		studentArr[1].setMat(99);
		studentArr[1].setSci(98);
		
		studentArr[2] = new Student();
		studentArr[2].setName("Park");
		studentArr[2].setKor(68);
		studentArr[2].setEng(86);
		studentArr[2].setMat(60);
		studentArr[2].setSci(40);

		for(int i = 0; i<studentArr.length;i++) {
			studentArr[i].print();
		}
		
		/*Student avg = new Student();
		double avgV = avg.getAvg();
		
		Student str = new Student();
		String grade = str.getGrade();*/
		
		/*System.out.println(p1.getName()+"���:"+p1.getAvg()+"\t"+"����:"+p1.getGrade());
		System.out.println(p2.getName()+"���:"+p2.getAvg()+"\t"+"����:"+p2.getGrade());
		System.out.println(p3.getName()+"���:"+p3.getAvg()+"\t"+"����:"+p3.getGrade());*/

	
		
	}

}
