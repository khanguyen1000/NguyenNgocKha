package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai24 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		// nhập dữ liệu
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// đầu ra
		System.out.println(" tất cả “ước số lẻ” của số nguyên dương n");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				System.out.print(" " + i + " ");
			}
		}

	}

}
