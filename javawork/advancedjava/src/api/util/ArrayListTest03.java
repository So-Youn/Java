package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java", "oracle","jdbc","htmls", "css","java"};
		ArrayList<String> list = changeData(arr);
		for(String data : list) {
			System.out.println("��� :"+data);
		}
		System.out.println("========================================");
		//for ���� �� ������ list.size()�� call�Ѵ�. 
		int size = list.size(); //size�� ����ȭ�ϸ鼭 resource�� ���� �� �ִ�.
		for (int i = 0; i<size ; i++) {
			System.out.println("��� : "+list.get(i));
		}
		//�ߺ��� �����Ϳ��� ����� ������ ���� ��� �����ϴ�.
		
				
	}
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		return list;
	}
}
