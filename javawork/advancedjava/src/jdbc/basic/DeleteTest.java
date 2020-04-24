package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		//���� ���ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				//���Ӱ���
				String user = "scott";
				//���Ӱ��� �н�����
				String password = "tiger";
				StringBuffer sql = new StringBuffer();
				sql.append("delete tb_board");
				sql.append("where boardnum = 3");
				try {
					// 1. ����Ŭ ����̹� �ε�
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("����̹��ε� ����!!");
					// 2. DBMS�� �����ϱ� - ���������� ����
					// ==> DBMS�� �����ϰ� ���������� ConnectionŸ������ ��ȯ�Ѵ�.
					Connection con = DriverManager.getConnection(url,user,password);
					System.out.println("���� ����: " + con);
					// 3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ� Connection��ü�� �̿��ؼ� ����
					Statement stmt = con.createStatement();
					int result = stmt.executeUpdate(sql.toString());
					System.out.println(result + "�� �� ���� ����");
				} catch(ClassNotFoundException e) {
					System.out.println("����̹��ε� ����");
				} catch(SQLException e) {
					System.out.println("�������: " + e.getMessage());
					e.printStackTrace();
				}
	}

}
