package cogent.infotec.MainClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/test";
	private static String jdbcUserName = "root";
	private static String jdbcPassword = "Aarash";
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	

}
