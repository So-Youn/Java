package api.util;

import java.util.ArrayList;

public class ArrayListExam02 {
	public static void main(String[] args) {
		/*��ȣ 	����	 	�ڹ� 		��	  android
		 * 1  	������  	97		100		88		=> ��ƾ� �� �����ʹ� ���������� Ÿ���� ���� �ٸ� ��, => StudentDOT ���� ���
		 * 2 	���� 		100		92		91
		 * 3 	������	88		96		78			
		 */
		//ArrayList�� ������ �����ϱ�
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		
		StudentDTO std1 = new StudentDTO(1,"������", 97,100,88);
		StudentDTO std2 = new StudentDTO(2,"����", 100,92,91);
		StudentDTO std3 = new StudentDTO(3,"������", 97,96,78);
		
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		display(stdlist);
	}
	//�Ű������� ���޹��� ArrayList�� ����� ������ ������ ����ϱ�
	public static void display(ArrayList<StudentDTO> stdlist) {
		int size = stdlist.size();
		for(int i =0;i<size;i++) {
			StudentDTO std = stdlist.get(i);
			System.out.print("��ȣ : "+std.getNumber()+",");
			System.out.print("����: "+std.getName()+",");
			System.out.print("�ڹ� : "+std.getJava()+",");
			System.out.print("�� : "+std.getWeb()+",");
			System.out.println("�ȵ���̵� : "+std.getAndroid());
			
			
		}
		
	}
	
}
