package NguyenNgocKha_buoi3;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// đầu vào
		Scanner sn = new Scanner(System.in);
		double a, b, c;
		double deta;
		double x1, x2;
		// nhập dữ liệu
		System.out.println("-----  ax2 + bx + c = 0   -------");
		System.out.print("a = ");
		a = sn.nextFloat();
		System.out.print("b = ");
		b = sn.nextFloat();
		System.out.print("c = ");
		c = sn.nextFloat();
		// xử lý
		deta = b * b - 4 * a * c;
		// đầu ra
		if (a != 0) {
			if (deta < 0) {
				System.out.println("phương trình vô nghiệm ");
			} else if (deta == 0) {
				x1 = -(b / (2 * a));
				System.out.println("phương trình có nghiệm kép x1=x2= " + x1);
			} else {
				x1 = (-b + Math.sqrt(deta)) / (2 * a);
				x2 = (-b - Math.sqrt(deta)) / (2 * a);
				System.out.println("phương trình có 2 nghiệm :");
				System.out.println("x1= " + x1);
				System.out.println("x2= " + x2);
			}
		} else {
			if (b == 0) {
				System.out.println("phương trình vô số nghiệm ");
			} else {
				x1 = -c / b;
				System.out.println("phương trình có 1 nghiệm x= " + x1);
			}
		}
	}

}
