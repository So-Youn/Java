package workbook.ClassTest;

public class AccountTest02 {
	public static void main(String[] args) {
		Account[] acc = new Account[5];

		for(int i = 0;i<acc.length;i++) {
			acc[i]=new Account("221-0101-211"+(i+1),100000,4.5);
			acc[i].print();
		}
		for(int i = 0;i<acc.length;i++) {
			acc[i]=new Account("221-0101-211"+(i+1),100000,3.7);
			acc[i].accountInfo()
			;
		}
	}

}
