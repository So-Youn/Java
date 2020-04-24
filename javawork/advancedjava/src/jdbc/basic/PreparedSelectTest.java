package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelectTest {
		public void Select() {
		String url = "jdbc:oracle:thin:@70.12.115.64:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //����̹� �ε�
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);
			//select �� ����
			rs = stmt.executeQuery();
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
		}finally { 
			try {	
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
		public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		obj.Select();
		
	}
	
	

}
