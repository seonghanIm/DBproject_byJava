package DBPROJECT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Connect_DB {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // jdbc 드라이버 주소 
	static final String DB_URL = "jdbc:mysql://localhost:3306/MOVIESYSTEM?useSSL=false"; // DB 접속 주소 //localhost는 접속하려는 데이터베이스 주소를 입력하시면 됩니다. localhost를 사용하면 됩니다. //3306은 데이터베이스에 접속할때 사용하는 포터번호입니다. 설치할때 설정한 포트번호를 사용합니다. //databasename에는 접속하려는 database의 name을 입력해줍니다. 
	static final String USERNAME = "root"; // DB ID 
	static final String PASSWORD = "sql1234!"; // DB Password
    
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;
	public Connect_DB(){
				System.out.print("MovieSystem DB 연결: ");
				try {
					Class.forName(JDBC_DRIVER); 
					conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); 
					
					if (conn != null){System.out.println("성공");}
					else{System.out.println("실패");}
						
				} catch (ClassNotFoundException e) {
					System.out.println("Class Not Found Exection");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("SQL Exception : " + e.getMessage());
					e.printStackTrace();
				}	

			}


	
}


