package oop.Chap06;

public class Test06 {

	public static void main(String[] args) {

		Student stu1= new Student("Kim",100,90,95,89);
		Student stu2 = new Student("Lee",60,70,99,98);
		Student stu3 = new Student("Park",68,86,60,40);
		
		
		

		
		System.out.println(stu1.getName()+"���:"+stu1.getAvg()+"\t"+"����:"+stu1.getGrade());
		System.out.println(stu2.getName()+"���:"+stu2.getAvg()+"\t"+"����:"+stu2.getGrade());
		System.out.println(stu3.getName()+"���:"+stu3.getAvg()+"\t"+"����:"+stu3.getGrade());
		//p1.print();
		
	}

}
