package Chap04;

//Break�� ���� - break���� ����� ���� ����������.
public class GuGu_Continue {

	public static void main(String[] args) {
		for (int dan = 1; dan <= 9; dan++) {
			if (dan == 5) {
				continue;
			} // continue�� ���Ե� ������ ���� �ö󰣴�.��, �ؿ��� ���� skip
			for (int i = 1; i <= 9; i++) {
				/*if (dan == 5) {
					break;
				} // break�� ���� for�� ����, �ܺ� for�� ���� x
*/				System.out.print(dan + "*" + i + "=" + dan * i + "\t");

			}
			System.out.println();
		}
	}

}
