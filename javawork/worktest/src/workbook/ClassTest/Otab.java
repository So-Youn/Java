package workbook.ClassTest;

public class Otab extends Mobile {
	public Otab(){
		
	}
	public Otab(String mobileName, int batterSize, String osType) {
		super(mobileName,batterSize,osType);
	}
	public int operate(int time) {		//���
		setBatterSize(getBatterSize()-12*time);
	
		return getBatterSize();
	}
	public int charge(int time) {		///����
		setBatterSize(getBatterSize()+8*time);
		
		return getBatterSize();
	}
}
