/*
 * Author : 
 * When : 
 * Objectives : 
 * Environment : Windows 10 , OpenJDK 11.0.16, Eclipse 2022-6
 * 
 */

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {   //프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
				
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + hakbun);
		System.out.println("주소 : " + address);
	}
}
