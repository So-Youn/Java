package workbook.ClassTest;

public class Students {
	private String name;
	private int age;
	private int height;
	private int weigt;
	
	public Students() {
		
	}

	public Students(String name, int age, int height, int weigt) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weigt = weigt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeigt() {
		return weigt;
	}

	public void setWeigt(int weigt) {
		this.weigt = weigt;
	}
	
	public void print() {
		System.out.println(getName()+"\t"+getAge()+"\t"+getHeight()+"\t"+getWeigt());
	}
	
}
