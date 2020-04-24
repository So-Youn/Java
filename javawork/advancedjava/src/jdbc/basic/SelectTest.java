package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.115.64:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select id,title,content from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //����̹� �ε�
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			//select �� ����
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("rs: " +rs);
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ����� ����
			while(rs.next()) { // => ���ڵ带 ��ȸ�ϱ� ���ؼ��� 
							   //���ڵ尡 �Ѱ��� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));
			}
		}catch(ClassNotFoundException e ) {
			e.printStackTrace();
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}

}