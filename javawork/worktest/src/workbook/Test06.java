package workbook;

public class Test06 {

	public static void main(String[] args) {

		Student p1 = new Student();
		p1.setName("Kim");
		p1.setKor(100);
		p1.setEng(90);
		p1.setMat(95);
		p1.setSci(89);
		
		Student p2 = new Student();
		p2.setName("Lee");
		p2.setKor(60);
		p2.setEng(70);
		p2.setMat(99);
		p2.setSci(98);
		
		Student p3 = new Student();
		p3.setName("Park");
		p3.setKor(68);
		p3.setEng(86);
		p3.setMat(60);
		p3.setSci(40);

		/*Student avg = new Student();
		double avgV = avg.getAvg();
		
		Student str = new Student();
		String grade = str.getGrade();*/
		
		System.out.println(p1.getName()+"���:"+p1.getAvg()+"\t"+"����:"+p1.getGrade());
		System.out.println(p2.getName()+"���:"+p2.getAvg()+"\t"+"����:"+p2.getGrade());
		System.out.println(p3.getName()+"���:"+p3.getAvg()+"\t"+"����:"+p3.getGrade());
		p1.print();
		
	}

}
