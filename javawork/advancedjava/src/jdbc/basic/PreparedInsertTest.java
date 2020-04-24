package jdbc.basic;
//�ܺο��� �Է� �޾� ó���ϵ��� ����.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {	
		Scanner key = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("********�Խñ� ����ϱ�*********");
		System.out.print("���̵� :");
		String id = key.next();
		System.out.print("���� : ");
		String title =key.next();
		System.out.print("���� :");
		String content = key.next();
		System.out.println();
		obj.insert(id,title,content);
		key.close();
	}
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		//command line ���� �۾��� ���� �ݵ�� commit �̳� rollback�� �۾��ϰ� �����ϱ�.
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql = "insert into tb_board values(board_seq.nextval,'"+
		             id+ "','" + title + "','" + content+ "','" + "',sysdate,0)";
		             statement ����� ���� sql*/
		String sql = "insert into tb_board values (board_seq.nextval,?,?,?,sysdate,0)";
		//preparestatement ����� ���� sql
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����" + con); 
			// 1. preparedStatement����
			stmt = con.prepareStatement(sql);
			// 2. ?�� �� �����ϱ�
			stmt.setString(1,id);
			stmt.setString(2,title);
			stmt.setString(3,content);
			int result = stmt.executeUpdate();
			//3. �����ϱ�
			System.out.println(result + "�� �� ���Լ���");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ���� : " + e.getMessage());
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
