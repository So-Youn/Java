package workbook;

public class Test02 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		Calc02 calc = new Calc02();
		//System.out.println(+calc.calculate(num));
		calc.calculate(num);
	}

}
