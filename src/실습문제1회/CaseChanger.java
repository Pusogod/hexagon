package 실습문제1회;

import java.util.Scanner;

public class CaseChanger {
	public static void main(String[] args) {

		int n = 91;
		int m = 123;

		System.out.println("문자 한 자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);

		char alpha;
		alpha = scan.next().charAt(0);
		int ss = alpha + 32;
		int aa = alpha - 32;
		int found = 0;
		char w = (char) ss;
		char q = (char) aa;

		for (int i = 65; i < n; i++) {
			if (alpha == i) {
				found = 1;
				System.out.println(w);
				break;
			}
		}

		for (int j = 97; j < m; j++) {
			if (alpha == j) {
				found = 1;
				System.out.println(q);
				break;
			}

		}
		if (found == 0) {
			System.out.println("영문자가 아닙니다.");
		}
//주석
	}
}
