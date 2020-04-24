package jdbc.basic;
//UpdateTest.java�� rename�ؼ� �۾�

//sql���� delete������ �����ؼ� �����غ���
//     --------- 3�� boardnum�� �Խù��� ����

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedDeleteTest obj = new PreparedDeleteTest();
		System.out.println("��ȣ");
		int boardnum = key.nextInt();
		System.out.println();
		obj.Delete(boardnum);
		key.close();

	}
	public void Delete(int boardnum){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "delete tb_board where boardnum= ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�����");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��" + con);
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,boardnum);
			int result = stmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("������� " + e.getMessage());
			e.printStackTrace(); // �������� �޽���
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
