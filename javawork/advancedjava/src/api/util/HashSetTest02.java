package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		print(set,"set");
		
		/*�������� �����ϴ� ����� =>Set��ü�� ������ �� ���������� ǥ���� Set�� �������� �Ű������� ����*/
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		print(set2,"set2");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
		set3.add("jdbc");
		set3.add("oracle");
		set3.add("hive");
		print(set3,"set3");
		
		//set�� set3�� ������ ���ϱ� - for���� ������ ������ ������ �ʱ� ����
		//set�� set3�� ����� ��� �� �ߺ��Ǵ� ��Ҹ� ������ ���ο� set������ �����
		//set�� set3�� ���ؼ� ��ġ�ϴ� �͸� ����� �������� ���ŵȴ�.
		set.retainAll(set3);
		
		print(set,"������");
		
	}
	public static void print(Set<String> set, String setName) {	//�������� ���� Set<E>
		System.out.println("������=>" + set.size());
		for (String data : set) {
			System.out.println(setName+"�� ����� ���=>"+data);
		}
		System.out.println("=============================");
	}
}