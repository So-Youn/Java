package jdbc.basic;
//2�� board num�� id�� kang���� ����.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql = "update tb_board set id = 'kang' where BOARDNUM = 3 ";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε�����");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���Ἲ��"+con);
		Statement stmt = con.createStatement();
		//System.out.println("sql �����ϱ� ���� ��ü����"+stmt);
		int result = stmt.executeUpdate(sql);
		
	}catch(ClassNotFoundException e) {
		System.out.println("����̹� �ε� ����");
	}catch(SQLException e) {
		System.out.println("������� "+e.getMessage());
	}

	}

}
