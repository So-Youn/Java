package chap08;

public class CalcTest {
	public static void main(String[] args) { // String���� ����...-> .equals()
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		
		Calculator calc = new Calculator();
		// args.length == 3 �϶� ~
		
		if (args.length == 3) {
			if (args[1].equals("+")) {
				calc.plus(a, b);
			} else if (args[1].equals("-")) {
				calc.minus(a, b);
			} else if (args[1].equals("*")) {
				calc.multiple(a, b);
			} else if (args[1].equals("/")) {
				calc.divide(a, b);
			}
			calc.print();
			//static�� �׳� �θ� �� �ֱ� ������ Calculator. ~ �ص� �Ǵµ�
			//�Ϲ� Ŭ���� ������ calc.~���� ȣ���ϱ�!

		} else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
	}

}
