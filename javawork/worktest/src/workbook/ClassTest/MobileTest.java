package workbook.ClassTest;



public class MobileTest {

	public static void main(String[] args) {
		Ltab M1 = 
				new Ltab("Ltab",500,"AP-01");
		Otab M2 = 
				new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile \t Battery \t Os \t");
		System.out.println("=======================================");
		M1.display();
		M2.display();
		M1.charge(10);
		M2.charge(10);
		System.out.println("Mobile \t Battery \t Os \t");
		System.out.println("=======================================");
		M1.display();
		M2.display();
		M1.operate(5);
		M2.operate(5);
		System.out.println("Mobile \t Battery \t Os \t");
		System.out.println("=======================================");
		M1.display();
		M2.display();
	}

}
