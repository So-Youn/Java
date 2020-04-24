package workbook;



public class Student extends Person{
	
	private int korean;
	private int english;
	private int math;
	private int science;
	public int getAvg = 0;

	public void setName(String name) { // setter�޼ҵ�
		this.name = name; // this : '��'�� ��Ī. �� ����.

	}

	public String getName() { // getter�޼ҵ�
		return this.name;
	}

	public void setKor(int korean) {
		this.korean = korean;
	}

	public int getKor() {
		return this.korean;
	}

	public void setMat(int math) {
		this.math = math;
	}

	public int getMat() {
		return this.math;
	}

	public void setEng(int english) {
		this.english = english;
	}

	public int getEng() {
		return this.english;
	}

	public void setSci(int science) {
		this.science = science;
	}

	public int getSci() {
		return this.science;
	}

	public double getAvg() {
		double avg = 0.0;
		avg = (double)(this.korean + this.english + this.math + this.science) / 4.0;
		return avg;
		//return 0.0;

	}

	public String getGrade() {
		String str = "";			//referece Ÿ��������, ���ͷ� ���·� �Ҵ� ����
		double avg = getAvg();
		if (avg > 100 | avg < 0) {
			System.out.println("�߸��Է�");
		} else {
			if (avg >= 90) {
				str = "A";
			} else if (avg >= 70) {
				str = "B";
			} else if (avg >= 50) {
				str = "C";
			} else if (avg >= 30) {
				str = "D";
			} else {
				str = "F";
			}
		}
		return str;
	}
		public void print() {
			System.out.println(getName()+"\t ���:"+getAvg()+"\t"+"����:"+getGrade());
		}

}
