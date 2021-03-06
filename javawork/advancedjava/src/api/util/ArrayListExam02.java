package api.util;

import java.util.ArrayList;

public class ArrayListExam02 {
	public static void main(String[] args) {
		/*번호 	성명	 	자바 		웹	  android
		 * 1  	강동원  	97		100		88		=> 담아야 할 데이터는 여러개지만 타입이 전부 다를 때, => StudentDOT 만들어서 사용
		 * 2 	현빈 		100		92		91
		 * 3 	차은우	88		96		78			
		 */
		//ArrayList에 데이터 저장하기
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		
		StudentDTO std1 = new StudentDTO(1,"강동원", 97,100,88);
		StudentDTO std2 = new StudentDTO(2,"현빈", 100,92,91);
		StudentDTO std3 = new StudentDTO(3,"차은우", 97,96,78);
		
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		display(stdlist);
	}
	//매개변수로 전달받은 ArrayList에 저장된 데이터 꺼내서 출력하기
	public static void display(ArrayList<StudentDTO> stdlist) {
		int size = stdlist.size();
		for(int i =0;i<size;i++) {
			StudentDTO std = stdlist.get(i);
			System.out.print("번호 : "+std.getNumber()+",");
			System.out.print("성명: "+std.getName()+",");
			System.out.print("자바 : "+std.getJava()+",");
			System.out.print("웹 : "+std.getWeb()+",");
			System.out.println("안드로이드 : "+std.getAndroid());
			
			
		}
		
	}
	
}
