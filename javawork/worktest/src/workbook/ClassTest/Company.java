package workbook.ClassTest;

public class Company {
	private double salary;		//�⺻��
	//double Sum = 0.0;			
	double bonus = 0.0;			//���ʽ�
	double annualIncome = 0.0;  	//���ҵ�
	double afterTaxIncome = 0.0;	//���� ���� �� ���ҵ��� ��
	double afterTaxBonus = 0.0;		//���� ���� �� �� ���ʽ��� ��

	public Company() {
	}

	public Company(double salary) {
		this.salary = salary;
	}


	public double getBonus() {
		for (int i = 1; i <= 12; i++) {
			if (i % 3 == 0) {
				bonus = bonus + this.salary * 0.2;
			} else {
			}
		}
		return bonus;
	}

	public double getIncome() {
		annualIncome= this.salary * 12;
		return annualIncome;
	}

	public double getAfterTaxIncome() {
		//afterTaxIncome = annualIncome - annualIncome * 0.1; ->���� �� ���ɼ� ����
		afterTaxIncome = getIncome()-(getIncome()*0.1);
		return afterTaxIncome;
	}	

	public double getAfterTaxBonus() {
		double afterTaxBonus = bonus - bonus * 0.055;
		return afterTaxBonus;
	}

}
