package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.115.64.1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select id,title,content from tb_board";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 			//드라이버 로딩
			con = DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			System.out.println("rs: " + rs);
			//ResultSet에 레코드가 존재하는 동안 반복문을 실행
			//레코드를 조회하기 위해서는 레코드가 한 개라도 반드시 커서를 이동시켜야 한다.
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString("content") + "\t");
				//System.out.print(rs.getDate(5) + "\t");
				//System.out.println(rs.getInt(6));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 실패: " + e.getMessage());
		} finally {
			//자원반납
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}