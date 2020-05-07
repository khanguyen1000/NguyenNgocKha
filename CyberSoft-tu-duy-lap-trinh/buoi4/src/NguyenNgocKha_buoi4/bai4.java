package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		int i = 1; // tịnh tiến
		int giaithua = 1;
		// nhập dữ liệu
		System.out.print("nhập n =");
		n = sn.nextInt();
		// xử lý
		if (n >= 0) {
			while (i <= n) {
				if (n == 0 || n == 1) {
					giaithua = 1;
				} else {
					giaithua *= i;
				}
				i++;

			}
		}else {
			System.out.println("lỗi ");
		}
		// đầu ra
		System.out.println(n + "! = " + giaithua);

	}
}
