package Chap05;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];

		Random rand = new Random();
		int num;
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 5; i++) {

			num = rand.nextInt(10);
			arr3[i] = num;
			System.out.print(arr3[i] + " ");
			sum = sum + arr3[i];
			count++;
		}
		System.out.println();
		System.out.println("sum=>" + sum);
		System.out.println("avg=>"+(double)sum/count);
	}

}
