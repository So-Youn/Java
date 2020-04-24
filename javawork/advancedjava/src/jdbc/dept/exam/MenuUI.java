package jdbc.dept.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	DeptDAO dep = new DeptDAOImpl();

	public void insertMenu() {
		System.out.println("*******�μ����********");
		System.out.print("�μ���ȣ :");
		String deptno = key.next();
		System.out.print("�μ� �̸�:");
		String dname = key.next();
		System.out.print("���� �ڵ�:");
		String loc_code = key.next();

		DeptDTO user = new DeptDTO(deptno, dname, loc_code);
		int result = dep.insert(user);
		if (result > 0) {
			System.out.println("�μ� ��� ����");
		} else {
			System.out.println("�μ� ��� ����");
		}
	}

	public void deleteMenu() {
		System.out.println("*******�μ�����********");
		System.out.print("�μ� ��ȣ:");
		String deptno = key.next();
		// ���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dep.delete(deptno);
		if (result > 0) {
			System.out.println("�μ� ���� ����");
		} else {
			System.out.println("�μ� ���� ����");
		}
	}

	public void selectMenu() {
		System.out.println("*******��ü�μ���ȸ********");
		// ���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<DeptDTO> deptlist = dep.getDeptList();
		int size = deptlist.size();
		for (int i = 0; i < size; i++) {
			DeptDTO dept = deptlist.get(i);
			System.out.println(dept.getDeptno() + "\t" + dept.getDname() + "\t" + dept.getLoc_code());
		}
	}
	public void updateMenu(DeptDTO dept){
		System.out.println("*******�μ�����********");
		System.out.print("�μ� ��ȣ:");
		String deptno = key.next();
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		//�ּҸ� ����
		int result = dep.update(dept);
		if(result > 0) {
			System.out.println("��� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}
}
	public void searchMenu() {
		System.out.println("*******��� �μ���� Ȯ���ϱ�********");
		// ���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<DeptDTO> deptlist = dep.getDeptList();
		int size = deptlist.size();
		for (int i = 0; i < size; i++) {
			DeptDTO dept = deptlist.get(i);
			System.out.println(dept.getDeptno() + "\t" + dept.getDname() + "\t" + dept.getLoc_code());
		}
	}
}
