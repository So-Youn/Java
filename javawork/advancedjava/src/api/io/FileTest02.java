package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

//������ ���θ� Ž��
public class FileTest02 {
	public static void main(String[] args) {
		//c:\iot\iotest������ ���� ���� �� ������ ���
		//[�������]
		//a---[����]
		//b---[����]
		//ArrayTest01.java ------[����]���� ������ ���]
		//
		
		//������ ������ ��¥�� �� �� ���� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		File file= new File("c:/iot/iotest");
		File[] list = file.listFiles();
		
		/*if(file.isDirectory()==true) {
			for (File file2 : list) {
				if(file2.isFile()!=true) {
					System.out.println(file2.getName()+"-----[����]");
				}else {
					System.out.println(file2.getName()+"-----[����:("+file2.length()+")]");
				}
				
			}*/
				
	
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println(list[i].getName()+"-----[����]");
			}else {
				System.out.println(list[i].getName()+"-----[����:("+list[i].length()+")]"+
						sdf.format(list[i].lastModified()));
			}
		}
		
	}
}
