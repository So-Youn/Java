package workbook.ClassTest;

public class CompanyTest {

	public static void main(String[] args) {
		//Coxmpany�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ� �ڵ� casting.
		int salary = Integer.parseInt(args[0]);
		Company comp = new Company(salary);
		
		
		System.out.println("�� �⺻�� �� : "+comp.getIncome()+" ����:"+comp.getAfterTaxIncome());
		System.out.println("�� ���ʽ� �� : "+comp.getBonus()+" ����:"+comp.getAfterTaxBonus());
		System.out.println("�� ���޾��� ��: "+(comp.getAfterTaxIncome()+comp.getAfterTaxBonus()));

	}	

}
