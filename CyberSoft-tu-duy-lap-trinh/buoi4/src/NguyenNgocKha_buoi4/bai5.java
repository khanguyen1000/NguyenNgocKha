package NguyenNgocKha_buoi4;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n, m;
		// nhập vào 2 số nguyên
		System.out.println("mời bạn nhập vào 2 số nguyên ");
		System.out.print("nhập số thứ 1 =");
		n = sn.nextInt();
		System.out.print("nhập số thứ 2 =");
		m = sn.nextInt();
		// xử lý
		menu(n, m);
	}

	public static void menu(int n, int m) {
		int luachon;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("------menu----- ");
			System.out.println("--0.thoát--");
			System.out.println("--1. IN ra tổng 2 số--");
			System.out.println("--2. In ra hiệu 2 số--");
			System.out.println("--3. in ra thương 2 số--");
			System.out.println("--4. in ra tích 2 số--");
			System.out.print("nhâp lựa chọn của bạn :");
			luachon = sn.nextInt();
			System.out.println("----------------------------------------------------");
			switch (luachon) {
			case 0: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("cảm ơn đã sử dụng ");
				System.exit(0);
				break;
			}
			case 1: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--1.tổng 2 số--");
				int tong = n + m;
				System.out.println("tổng " + n + " + " + m + " =" + tong);
				break;
			}
			case 2: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--2.hiệu 2 số--");
				int hieu = n - m;
				System.out.println("Hiệu " + n + " - " + m + " =" + hieu);
				break;
			}
			case 3: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--3.thương 2 số--");
				float thuong;
//				if(m==0) {
//					thuong=0;
//				}else {
				thuong = n / m;
//				}
				System.out.println("thương 2 số :" + thuong);
				break;
			}
			case 4: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--4.tích 2 số--");
				int tich = m * n;
				System.out.println("tích 2 số là :" + tich);
				break;
			}
			default: {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("vui lòng chọn từ (0-->4)");
				break;
			}
			}
		} while (luachon != 0);
	}
}
