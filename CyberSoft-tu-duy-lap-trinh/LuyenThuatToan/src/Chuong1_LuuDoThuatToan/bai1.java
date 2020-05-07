package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

//Tính S(n) = 1 + 2 + 3 + … + n.
public class bai1 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		// nhập dữ liệu
		System.out.println("Tính S(n) = 1 + 2 + 3 + … + n.");
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		int S = 0;
		String str = "";
		for (int i = 1; i <= n; i++) {
			str += "+ " + i;
			S += i;
		}
		// đầu ra
		System.out.println("S(" + n + ") =" + str + " .");
		System.out.println("S = " + S);

	}
}
