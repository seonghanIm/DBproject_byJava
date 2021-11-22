package DBPROJECT;

import java.sql.SQLException;
import java.util.Scanner;

public class DELETE extends Connect_DB {

	Scanner sc;
	
	public void Member_delete() throws SQLException {
		sc = new Scanner(System.in);
		print("지우고 싶은 멤버의 멤버 번호를 입력하세요 : ");
	    int NumDelete = sc.nextInt();
	    
	    String sql = "DELETE FROM MEMBER WHERE MEMNUM =?";
	    try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, NumDelete);
			int result = psmt.executeUpdate();
			if(result == 1)
			{
				println("데이터 삭제 완료");
			}
		
		} catch (SQLException e) {
		     System.out.println("에러 : " + e);
		}finally {
			if(psmt!=null && !psmt.isClosed())
			{
				psmt.close();
				return;
			}
		}
		
		
	}
	public void Movie_delete() throws SQLException {
		sc = new Scanner(System.in);
		print("지우고 싶은 영화의 영화 번호를 입력하세요 : ");
	    int NumDelete = sc.nextInt();
	    
	    String sql = "DELETE FROM MOVIE WHERE MOVIENUM =?";
	    try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, NumDelete);
			int result = psmt.executeUpdate();
			if(result == 1)
			{
				println("데이터 삭제 완료");
			}
		
		} catch (SQLException e) {
		     System.out.println("에러 : " + e);
		}finally {
			if(psmt!=null && !psmt.isClosed())
			{
				psmt.close();
				return;
			}
		}
		
		
		
	}
	public void Review_delete() throws SQLException {
		sc = new Scanner(System.in);
		print("지우고 싶은 리뷰의 리뷰 번호를 입력하세요 : ");
	    int NumDelete = sc.nextInt();
	    
	    String sql = "DELETE FROM REVIEW WHERE REVIEWNUM =?";
	    try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, NumDelete);
			int result = psmt.executeUpdate();
			if(result == 1)
			{
				println("데이터 삭제 완료");
			}
		
		} catch (SQLException e) {
		     System.out.println("에러 : " + e);
		}finally {
			if(psmt!=null && !psmt.isClosed())
			{
				psmt.close();
				return;
			}
		}
		
		
		
	}
	public void Theater_delete() throws SQLException {
		sc = new Scanner(System.in);
		print("지우고 싶은 영화관의 영화관 번호를 입력하세요 : ");
	    int NumDelete = sc.nextInt();
	    
	    String sql = "DELETE FROM THEATER WHERE THNUM =?";
	    try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, NumDelete);
			int result = psmt.executeUpdate();
			if(result == 1)
			{
				println("데이터 삭제 완료");
			}
		
		} catch (SQLException e) {
		     System.out.println("에러 : " + e);
		}finally {
			if(psmt!=null && !psmt.isClosed())
			{
				psmt.close();
				return;
			}
		}
		
		
		
	}
	public void Ticket_delete() throws SQLException {
		sc = new Scanner(System.in);
		print("지우고 싶은 티켓의 티켓 번호를 입력하세요 : ");
	    int NumDelete = sc.nextInt();
	    
	    String sql = "DELETE FROM TICKET WHERE RSNUM =?";
	    try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, NumDelete);
			int result = psmt.executeUpdate();
			if(result == 1)
			{
				println("데이터 삭제 완료");
			}
		
		} catch (SQLException e) {
		     System.out.println("에러 : " + e);
		}finally {
			if(psmt!=null && !psmt.isClosed())
			{
				psmt.close();
				return;
			}
		}
		
		
		
	}
	
	
	public void print(String string) {
		System.out.print(string);
	}

	public void println(String string) {
		System.out.println(string);
	}

}


