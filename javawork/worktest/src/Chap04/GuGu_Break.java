package Chap04;

//Break문 연습 - break문이 선언된 블럭을 빠져나간다.
public class GuGu_Break {

	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			if (dan == 5) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				/*if (dan == 5) {
					break;
				} // 내부 for만 영향, 외부 for는 영향 x
*/				System.out.print(dan + "*" + i + "=" + dan * i + "\t");

			}
			System.out.println();
		}
	}

}
