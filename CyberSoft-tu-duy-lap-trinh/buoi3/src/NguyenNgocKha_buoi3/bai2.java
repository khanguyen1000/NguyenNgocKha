package NguyenNgocKha_buoi3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		float a, b, c;
		String kiemtra;
		String kq;

		// nhập dữ liệu
		System.out.println("nhập 3 số a b c ");
		do {
		System.out.print("a = ");
		a = sn.nextFloat();
		System.out.print("b = ");
		b = sn.nextFloat();
		System.out.print("c = ");
		c = sn.nextFloat();
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("a,b,c phải lớn hơn 0 (a,b,c>0)");
		}
		}while(a < 0 || b < 0 || c < 0);
		
		// xử lý
		if ((a + b) > c || (a + c) > b || (b + c) > a) {

			if (a == b || b == c || a == c) {

				if (a == b && a == c) {
					kq = "tam giác đều ";
				} else {
					kq = "tam giác cân ";
				}
			} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {

				if (b == c || a == c || b == a) {
					kq = "tam giác vuông cân";
				} else {
					kq = "tam giác vuông ";
				}
			} else {
				kq = "tam giác thường ";
			}
		} else {
			kq = "không phải tam giác ";
		}
		// đầu ra
		System.out.println(kq);

	}
}
