package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai25 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		int S = 0;
		// nhập dữ liệu
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		// xử lý

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i + (i == n ? "\n" : " ,"));
				if (i % 2 == 0) {
					S += i;
				}
			}
		}

		// đầu ra
		System.out.println(" tổng tất cả “ước số chẵn” của số nguyên dương n. :" + S);

	}

}
