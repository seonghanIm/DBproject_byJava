package DBPROJECT;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	Scanner sc;
    Connect_DB cd;
    ADD add = null;
    Search search = null;
    DELETE de = null;
	public void start() throws SQLException {
	    cd = new Connect_DB();
		System.out.println("---메뉴---");
		System.out.println("1. 추가....");
		System.out.println("2. 조회....");
		System.out.println("3. 삭제....");
		System.out.println("0. 종료....");
		System.out.print("원하는 기능을 선택하세요....");

		sc = new Scanner(System.in);
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			Menu_Add();
			break;
		case 2:
			Menu_Search();
			break;
		case 3:
			Menu_Delete();
			break;
		case 0:
			return;

		}

	}

	public void Menu_Add() throws SQLException {
		
		add = new ADD();
		while(true)
		{
			  cd = new Connect_DB();
		System.out.println("---추가 메뉴---");
		System.out.println("1. 회원 추가 ");
		System.out.println("2. 영화 추가 ");
		System.out.println("3. 리뷰 추가 ");
		System.out.println("4. 영화표 추가 ");
		System.out.println("5. 극장 추가 ");
		System.out.println("0. 뒤로 가기");
		System.out.print("선택 : ");
		sc = new Scanner(System.in);
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
           add.Member_Input();
			break;
		case 2:
			add.Movie_input();
			break;
		case 3:
			add.Review_input();
			break;
		case 4:
			add.Ticket_input();
			break;
		case 5:
			add.Theater_input();
			break;
		case 0:
			start();
			return;

		}
		}
	}

	public void Menu_Search() throws SQLException {
		 
		
		while(true)
		{
			search = new Search();
			 cd = new Connect_DB();
		
		System.out.println("---조회 메뉴---");
		System.out.println("1. 회원 조회 ");
		System.out.println("2. 영화 조회 ");
		System.out.println("3. 리뷰 조회 ");
		System.out.println("4. 영화표 조회 ");
		System.out.println("5. 극장 조회 ");
		System.out.println("0. 뒤로 가기");
		System.out.print("선택 : ");
		sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch (sel) {
		case 1:
			search.Member_Search();
			break;
		case 2:
			search.Movie_Search();
		    break;
		case 3:
		    search.Review_Search();
		    break;
		case 4:
			search.Ticket_Search();
		    break;
		case 5:
			search.Theater_Search();
		    break;
		case 0:
			start();
			return;
		}
		
		}
	}
		

	public void Menu_Delete() throws SQLException {
		while(true)
		{
			 cd = new Connect_DB();
			 de = new DELETE();
		System.out.println("---삭제 메뉴---");
		System.out.println("1. 회원 삭제 ");
		System.out.println("2. 영화 삭제 ");
		System.out.println("3. 리뷰 삭제 ");
		System.out.println("4. 영화표 삭제 ");
		System.out.println("5. 극장 삭제 ");
		System.out.println("0. 뒤로 가기");
		System.out.print("선택 : ");
		sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch (sel) {
		case 1:
			de.Member_delete();
			break;
		case 2:
			de.Movie_delete();
		    break;
		case 3:
		   de.Review_delete();
		    break;
		case 4:
			de.Ticket_delete();
		    break;
		case 5:
			de.Theater_delete();
		    break;
		case 0:
			start();
			return;
		}
		}
		
		}
	}


