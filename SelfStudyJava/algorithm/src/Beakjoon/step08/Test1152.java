package Beakjoon.step08;
import java.util.*;
public class Test1152 {
	/* 
	 * next()�� ������ �������� �Ѵܾ �Է¹޴´�.
	 * nextLine()�� �� ���� ��ü�� �Է¹޴´�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] arr = input.split(" ");
		sc.close();
		if(input.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(arr.length);
		}
		
		
	}

}
