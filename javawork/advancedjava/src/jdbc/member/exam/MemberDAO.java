package jdbc.member.exam;

import java.util.ArrayList;

public interface MemberDAO {
	int insert(MemberDTO user);			//��� ���
	int update(String id, String addr); //������� ����
	int delete(String id);				//��� Ż��
	//void select();						
	ArrayList<MemberDTO> memberList();	//��ü ������ ��ȸ
	ArrayList<MemberDTO> findByAddr(String addr);	//�ּҷ� �˻��ϱ�
	MemberDTO Login(String id, String pass);
	//�α����� �ܼ��� �ֳ� ���İ� �ƴ� ����ó���� �ʿ��ϱ� ������ memberDTO�� ������Ÿ������ 
}