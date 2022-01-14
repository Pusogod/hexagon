package 실습문제1회;

import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 >> ");
		int money = scan.nextInt();
		
		int div = 50000;
		int[] count = new int[11];
		System.out.print("출력 >> ");
		
		for (int i = 0; i < 10; i++) {
			if(!(i == 2) || (i == 4) || (i == 8)) {
				count[i] = money / div;
				money %= div;
			}
			if (count[i] != 0) {
				System.out.printf("%d원 %d개", div, count[i]);
			}
			if(i % 2 == 0) div /= 5;
			else div /= 2;
		}
		scan.close();
	}
}