package api.util;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();//Vector<������Ÿ��>
		v.add(10);
		
		
		System.out.println("Vector�� �뷮 : "+v.capacity()); //�� ������
		System.out.println("Vector�� �뷮 : "+v.size());
		//api�� method call�� �����ؾ��Ѵ�.
		System.out.println();
		System.out.println("=============================");
		for(int i =0;i<10;i++) {
			v.add(i);
		}
		
		System.out.println("Vector�� �뷮 : "+v.capacity()); //�� ������
		System.out.println("Vector�� �뷮 : "+v.size());
		//api�� method call�� �����ؾ��Ѵ�.
		System.out.println();
		System.out.println("=============================");
		for(int i =0;i<10;i++) {
			v.add(i);
		}
		
	}

}
