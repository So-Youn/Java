package workbook.ClassTest;

public class BookTest {
	public static void main(String[] args) {
		
		Book bookArray[] = new Book[3];
		bookArray[0] = new Book("SQL Plus",50000,5.0);
		bookArray[1] = new Book("Java 2.0",40000,3.0);
		bookArray[2] = new Book("JSP Servlet",60000,6.0);
		
		System.out.println("bookName \t bookPrice(��) \t bookDiscountRate(%)");
		for (int i = 0; i < bookArray.length; i++) {
			bookArray[i].print();
		}
		System.out.println("[OPTION]");
		System.out.println("å ������ ��:"+(bookArray[0].getBookPrice()+bookArray[1].getBookPrice()+bookArray[2].getBookPrice())+"��");
		System.out.println("���� �� å ������ ��:"+(bookArray[0].getDiscountBookPrice()+bookArray[1].getDiscountBookPrice()
				+bookArray[2].getDiscountBookPrice())+"��");
	}

}
