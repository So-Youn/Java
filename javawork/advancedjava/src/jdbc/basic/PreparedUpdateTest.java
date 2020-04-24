package jdbc.basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		System.out.println("********�Խñ� ����ϱ�*********");
		System.out.println("��ȣ");
		int boardnum = key.nextInt();
		System.out.println("���̵�");
		String id = key.next();
		obj.Update(boardnum, id);
		

	}
	public void Update(int boardnum, String id) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "update tb_board set id = ? where BOARDNUM = ? ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�����");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1,id);
			stmt.setInt(2,boardnum);
		
			//System.out.println("sql �����ϱ� ���� ��ü����"+stmt);
			int result = stmt.executeUpdate();
			
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("������� "+e.getMessage());
		}finally { 
			try {	
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
