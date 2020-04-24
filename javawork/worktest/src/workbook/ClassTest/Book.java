package workbook.ClassTest;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	double disprice=0.0;
	
	public Book() {
	}
	public Book(String bookName,int bookPrice,double bookDiscountRate) {
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookDiscountRate=bookDiscountRate;
	}
	public void setBookName(String bookName){
		this.bookName =bookName; 
	}
	public String getBookName() {
		return bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		disprice=this.bookPrice-this.bookPrice*this.bookDiscountRate/100;
		return disprice;
	}
	public void print() {
		System.out.println(getBookName()+"\t "+ getBookPrice()+"��\t\t\t"+getBookDiscountRate()+"%\t"+getDiscountBookPrice());
	}
}
