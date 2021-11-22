package DBPROJECT;

import java.sql.SQLException;
import java.util.Scanner;

public class Search extends Connect_DB {
	Scanner sc;
	int j = 1;

	public void Member_Search() throws SQLException {
		String sql = "SELECT * FROM MOVIESYSTEM.member;";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				println("----------------------------");
				print("멤버번호 : ");
				System.out.print(rs.getString("MEMNUM"));
				println("");
				print("멤버ID : ");
				System.out.print(rs.getString("MEMID"));
				println("");
				print("멤버Password : ");
				System.out.print(rs.getString("MEMPW"));
				println("");
				print("멤버이름 : ");
				System.out.print(rs.getString("MEMNAME"));
				println("");
				print("멤버 전화번호 : ");
				System.out.print(rs.getString("PHONE"));
				println("");
				print("멤버 주소 : ");
				System.out.print(rs.getString("MEMADDRESS"));
				println("");
				print("멤버 생년원일 : ");
				System.out.print(rs.getString("Birth"));
				println("");
				print("멤버 이메일 : ");
				System.out.print(rs.getString("EMAIL"));
				println("");

				println("----------------------------");

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}

	}

	public void Movie_Search() throws SQLException {
		String sql = "SELECT * FROM MOVIESYSTEM.MOVIE;";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				println("----------------------------");
				print("영화 번호 : ");
				System.out.print(rs.getString(1));
				println("");
				print("영화 배우/감독 : ");
				System.out.print(rs.getString(2));
				println("");
				print("영화 제목 : ");
				System.out.print(rs.getString(3));
				println("");
				print("영화 장르 : ");
				System.out.print(rs.getString(4));
				println("");
				print("영화 등급 : ");
				System.out.print(rs.getString(5));
				println("");
				print("영화 줄거리 : ");
				System.out.print(rs.getString(6));
				println("");
				print("리뷰 번호: ");
				System.out.print(rs.getString(7));
				println("");

				println("----------------------------");

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
	}

	public void Review_Search() throws SQLException {
		String sql = "SELECT * FROM MOVIESYSTEM.REVIEW;";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				println("----------------------------");
				print("리뷰 번호 : ");
				System.out.print(rs.getString(1));
				println("");
				print("리뷰 제목 : ");
				System.out.print(rs.getString(2));
				println("");
				print("리뷰 내용 : ");
				System.out.print(rs.getString(3));
				println("");
				print("평점 : ");
				System.out.print(rs.getString(4));
				println("");
				print("영화 번호 : ");
				System.out.print(rs.getString(5));
				println("");
				print("멤버 번호 : ");
				System.out.print(rs.getString(6));
				println("");

				println("----------------------------");

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
	}

	public void Theater_Search() throws SQLException {
		String sql = "SELECT * FROM MOVIESYSTEM.THEATER;";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				println("----------------------------");
				print("영화관 번호 : ");
				System.out.print(rs.getString(1));
				println("");
				print("영화관 이름 : ");
				System.out.print(rs.getString(2));
				println("");
				print("타임 테이블: ");
				System.out.print(rs.getString(3));
				println("");
				print("상영관 이름 : ");
				System.out.print(rs.getString(4));
				println("");
				print("좌석수 : ");
				System.out.print(rs.getString(5));
				println("");
				println("----------------------------");

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
	}

	public void Ticket_Search() throws SQLException {
		String sql = "SELECT * FROM MOVIESYSTEM.TICKET;";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				println("----------------------------");
				print("티켓 번호 : ");
				System.out.print(rs.getString(1));
				println("");
				print("좌석 번호 : ");
				System.out.print(rs.getString(2));
				println("");
				print("영화 번호 : ");
				System.out.print(rs.getString(3));
				println("");
				print("멤버 이름  : ");
				System.out.print(rs.getString(4));
				println("");

				println("----------------------------");

			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			if (conn != null && !conn.isClosed()) {
				conn.close();
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
