package oop.Chap07.poly.email;
public class SMSSender extends Sender {
	int length;
	public SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender�θ� ó���Ǵ� ������ ��� ����
		System.out.println(length+"��"+name+"���� �Ϸ�.");
	}
	
}
