package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		System.out.println("UserDAO클래스의 UserDAO()실행");
		try {
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbID = "scott";
			String dbPassword = "tiger";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String userID, String userPassword) {
		System.out.println("UserDAO클래스의 login()실행");
		String SQL = "SELECT userPassword FROM USE WHERE userID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1; // 로그인 성공
				}
				else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디 없음
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터 베이스 오류
	}
	
	public int join(User user) {
		System.out.println("UserDAO클래스의 join()실행");
		String SQL = "INSERT INTO USE VALUES (?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
