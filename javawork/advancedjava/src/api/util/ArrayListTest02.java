package api.util;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڹ�");
		list.add("����Ŭ");
		for(int i = 0 ; i< list.size(); i++) { //�迭�� length�� ���.
			System.out.println(list.get(i));
		}
		//����� �ڵ����� �þ��.
		
	}

}
