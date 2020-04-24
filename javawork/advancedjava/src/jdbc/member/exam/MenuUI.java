package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.board.exam.BoardDTO;

public class MenuUI {//����ڰ� �Է��ϴ� ���� ó���ϴ� Ŭ����
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	
	public void insertMenu(){
		//�Ի����� ���� ��¥ - sysdate, point = 1000
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(user);
		if(result > 0) {
			System.out.println("��� ��� ����");
		} else {
			System.out.println("��� ��� ����");
		}
	}
	public void selectMenu(){
		System.out.println("*******��ü�����ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<MemberDTO> memberList =  dao.memberList();
		int size = memberList.size();
		for(int i=0;i<size;i++) {
			MemberDTO member =  memberList.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+
					member.getName()+"\t"+ member.getAddr()+"\t"+member.getDeptno()
					+member.getHireDate()+"\t"+member.getPoint());
		}
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		//�ּҸ� ����
		int result = dao.update(id, addr);
		if(result > 0) {
			System.out.println("��� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("��� ���� ����");
		} else {
			System.out.println("��� ���� ����");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for (int i = 0;i<size ; i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+
			member.getName()+"\t"+ member.getAddr()+"\t"+member.getDeptno()
			+member.getHireDate()+"\t"+member.getPoint());
			
		}
	}
	
	
	public void LoginMenu(){
		System.out.println("*******�α���********");
		System.out.print("���̵� :");
		String id = key.next();
		System.out.println("��й�ȣ :");
		String pass = key.next();
		MemberDTO member = dao.Login(id, pass);
		if(member==null) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		
	}
	
}