package workbook.ClassTest;

public class Mobile {
	private String mobileName;
	private int batterSize;
	private String osType;
	
	public Mobile() {
		
	}
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterSize() {
		return batterSize;
	}

	public void setBatterSize(int batterSize) {
		this.batterSize = batterSize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public Mobile(String mobileName, int batterSize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterSize = batterSize;
		this.osType = osType;
	}
	
	public int operate(int time) {		//���
		setBatterSize(getBatterSize());
		batterSize=batterSize-10*time;
		return batterSize;
	}
	public int charge(int time) {		///����
		setBatterSize(getBatterSize());
		batterSize=batterSize+10*time;
		return batterSize;
	}

	public void display() {
		System.out.println(getMobileName()+"\t"+getBatterSize()+"\t\t"+getOsType());
		
	}
	
}
