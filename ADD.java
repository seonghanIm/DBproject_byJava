package DBPROJECT;

import java.sql.*;

import java.util.Scanner;

public class ADD extends Connect_DB {
	Scanner sc;
	int i;

	// Member table info
	int MemNum;
	String MemID;
	String Name;
	String MemPw;
	String Email;
	int phone;
	String Address;
	int Birth;

	// Movie table info
	int MovieNum;
	String Title;
	String Genre;
	String Level;
	String Actor;
	String Story;
	
	//Review table info
	int ReviewNum;
	String RvTitle;
	String RvContent;
	int Rate; 
	
	//Theater table info
	int TNumber;
	String Tname;
	String Ttable;
	String RoomNum;
	int SeatNum;
	
	//Ticket table info
	int RsNum;
	String Seat;


	public void Member_Input() throws SQLException {
		sc = new Scanner(System.in);
		println("----추가 할 정보 입력----");
		print("회원 번호를 입력해주세요 : ");
		MemNum = sc.nextInt();
		println("");
		print("회원 ID를 입력해주세요 : ");
		MemID = sc.next();
		println("");
		print("회원 비밀번호를 입력해주세요 : ");
		MemPw = sc.next();
		println("");
		print("회원 이름을 입력해주세요 : ");
		Name = sc.next();
		println("");
		print("회원 이메일을 입력해주세요 : ");
		Email = sc.next();
		println("");
		print("회원 주소를 입력해주세요 : ");
		Address = sc.next();
		println("");
		print("회원 전화번호를 입력해주세요 : ");
		phone = sc.nextInt();
		println("");
		print("회원 생년월일을 입력해주세요(6자리) : ");
		Birth = sc.nextInt();
		println("");
		ADD_MEMBER();
	}

	public void ADD_MEMBER() throws SQLException {

		String sql = "INSERT INTO member() VALUES (?,?,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, MemNum);
			psmt.setString(2, MemID);
			psmt.setString(3, MemPw);
			psmt.setString(4, Name);
			psmt.setInt(5, phone);
			psmt.setString(6, Address);
			psmt.setInt(7, Birth);
			psmt.setString(8, Email);
			// ResultSet rs = stmt.executeQuery(sql);

			int result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공!");
			}
		} catch (Exception e) {
			println("데이터 삽입 실패!");
		} finally {
			if (psmt != null && !psmt.isClosed()) {
				psmt.close();
				return;
			}
		}

	}

	public void Movie_input() throws SQLException {
		sc = new Scanner(System.in);
		println("----추가 할 정보 입력----");
		print("영화 번호를 입력해주세요 : ");
		MovieNum = Integer.parseInt(sc.nextLine());
		println("");

		print("영화 제목을 입력해주세요 : ");
		Title = sc.nextLine();
		println("");

		print("영화 장르를 입력해주세요 : ");
		Genre = sc.nextLine();
		println("");

		print("관람 등급을 입력해주세요 : ");
		Level = sc.nextLine();
		println("");

		print("배우/제작진을 입력해주세요 : ");
		Actor = sc.nextLine();
		println("");

		print("줄거리를 입력해주세요 : ");
		Story = sc.nextLine();
		println("");

		ADD_MOVIE();

	}

	public void ADD_MOVIE() throws SQLException {

		String sql = "INSERT INTO MOVIE() VALUES (?,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, MovieNum);
			psmt.setString(2, Title);
			psmt.setString(3, Actor);
			psmt.setString(4, Genre);
			psmt.setString(5, Level);
			psmt.setString(6, Story);
			psmt.setString(7, null);
			// ResultSet rs = stmt.executeQuery(sql);

			int result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공!");
			}
		} catch (Exception e) {
			println("데이터 삽입 실패!");
		} finally {
			if (psmt != null && !psmt.isClosed()) {
				psmt.close();
				return;
			}
		}

	}
	
	public void Review_input() throws SQLException {
		sc = new Scanner(System.in);
		println("----추가 할 정보 입력----");
		print("리뷰 번호를 입력해주세요 : ");
		ReviewNum = Integer.parseInt(sc.nextLine());
		println("");
		
		print("회원번호를 입력해주세요 : ");
		MemNum = Integer.parseInt(sc.nextLine());
		println("");

		print("리뷰 제목을 입력해주세요 : ");
		RvTitle = sc.nextLine();
		println("");

		print("리뷰 내용을 입력해주세요 : ");
		RvContent = sc.nextLine();
		println("");

		print("평점을 입력해주세요 : ");
		Rate = Integer.parseInt(sc.nextLine());
		println("");

		print("영화 번호를 입력해주세요 : ");
		MovieNum = Integer.parseInt(sc.nextLine());
		println("");
		ADD_REVIEW();

	}
	
	public void ADD_REVIEW() throws SQLException {

		String sql = "INSERT INTO REVIEW() VALUES (?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ReviewNum);
			psmt.setString(2, RvTitle);
			psmt.setString(3, RvContent);
			psmt.setInt(4, Rate);
			psmt.setInt(5, MovieNum);
			psmt.setInt(6, MemNum);
			
			// ResultSet rs = stmt.executeQuery(sql);

			int result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공(Review table)");
			}
			psmt.close();
			
			sql = "UPDATE MOVIE SET REVIEWNUM = ? WHERE MOVIENUM = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ReviewNum);
			psmt.setInt(2, MovieNum);
			result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공(Movie table)");
			}
		} catch (Exception e) {
			println("데이터 삽입 실패!");
		} finally {
			if (psmt != null && !psmt.isClosed()) {
				psmt.close();
				return;
			}
		}

	}
	public void Theater_input() throws SQLException {
		sc = new Scanner(System.in);
		println("----추가 할 정보 입력----");
		print("극장 번호를 입력해주세요 : ");
	    TNumber = Integer.parseInt(sc.nextLine());
		println("");
		
		print("극장 이름을 입력해주세요 : ");
		Tname = sc.nextLine();
		println("");

		print("상영 시간표를 입력해주세요 : ");
		Ttable = sc.nextLine();
		println("");

		print("상영관 이름을 입력해주세요 : ");
		RoomNum = sc.nextLine();
		println("");

		print("좌석수를 입력해주세요 : ");
		SeatNum = Integer.parseInt(sc.nextLine());
		println("");
        ADD_Theater();
	

	}
	public void ADD_Theater() throws SQLException {

		String sql = "INSERT INTO THEATER() VALUES (?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, TNumber);
			psmt.setString(2, Tname);
			psmt.setString(3, Ttable);
			psmt.setString(4, RoomNum);
			psmt.setInt(5, SeatNum);
			// ResultSet rs = stmt.executeQuery(sql);

			int result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공!");
			}
		} catch (Exception e) {
			println("데이터 삽입 실패!");
		} finally {
			if (psmt != null && !psmt.isClosed()) {
				psmt.close();
				return;
			}
		}

	}
	
	public void Ticket_input() throws SQLException {
		sc = new Scanner(System.in);
		println("----추가 할 정보 입력----");
		print("티켓 번호를 입력해주세요 : ");
		RsNum = Integer.parseInt(sc.nextLine());
		println("");
		
		print("회원번호를 입력해주세요 : ");
		MemNum = Integer.parseInt(sc.nextLine());
		println("");

		print("좌석을 입력해주세요 : ");
		Seat = sc.nextLine();
		println("");

		print("영화 번호를 입력해주세요 : ");
		MovieNum = Integer.parseInt(sc.nextLine());
		println("");
		ADD_Ticket();
	
	}
	
	public void ADD_Ticket() throws SQLException {

		String sql = "INSERT INTO TICKET() VALUES (?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, RsNum);
			psmt.setString(2, Seat);
			psmt.setInt(3, MovieNum);
			psmt.setInt(4, MemNum);
	
			// ResultSet rs = stmt.executeQuery(sql);

			int result = psmt.executeUpdate();
			if (result == 1) {
				println("데이터 삽입 성공!");
			}
		} catch (Exception e) {
			println("데이터 삽입 실패!");
		} finally {
			if (psmt != null && !psmt.isClosed()) {
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
