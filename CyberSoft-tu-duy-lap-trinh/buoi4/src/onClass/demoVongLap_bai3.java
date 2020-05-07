package onClass;

import java.util.Scanner;

public class demoVongLap_bai3 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n, m;
		int luachon;
		// nhập vào 2 số nguyên
		System.out.println("mời bạn nhập vào 2 số nguyên ");
		System.out.print("nhập số thứ 1 =");
		n = sn.nextInt();
		System.out.print("nhập số thứ 2 =");
		m = sn.nextInt();
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("------menu----- ");
			System.out.println("--0.thoát--");
			System.out.println("--1. IN ra tổng 2 số--");
			System.out.println("--2. In ra hiệu 2 số--");
			System.out.println("--3. in ra số nào lớn hơn--");
			System.out.print("nhâp lựa chọn của bạn :");
			luachon = sn.nextInt();
			System.out.println("----------------------------------------------------");
			// switch case
			// switch(luachon) {
			// case 0 :{
			// System.out.println();
			// System.out.println("----------------------------------------------------");
			// System.out.println("cảm ơn đã sử dụng ");
			// System.exit(0);
			// break;
			// }
			// case 1:{
			// System.out.println();
			// System.out.println("----------------------------------------------------");
			// System.out.println("--1. IN ra tổng 2 số--");
			// int tong=n+m;
			// System.out.println("tổng " +n+ " + "+m+" ="+tong);
			// break;
			// }case 2:{
			// System.out.println();
			// System.out.println("----------------------------------------------------");
			// System.out.println("--2. In ra hiệu 2 số--");
			// int hieu=n-m;
			// System.out.println("Hiệu " +n+ " - "+m+" ="+hieu);
			// break;
			// }case 3:{
			// System.out.println();
			// System.out.println("----------------------------------------------------");
			// System.out.println("--3. in ra số nào lớn hơn--");
			// if(m>n) {
			// System.out.println("số lớn nhất là : "+m);
			// }else {
			// System.out.println("số lớn nhât là : "+n);
			// }
			// break;
			// }default :{
			// System.out.println();
			// System.out.println("----------------------------------------------------");
			// System.out.println("vui lòng chọn từ (0-->3)");
			// break;
			// }
			// }
			// if else
			if (luachon == 1) {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--1. IN ra tổng 2 số--");
				System.out.println("tổng " + n + " + " + m + " =" + tong(n,m));
			} else if (luachon == 2) {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--2. In ra hiệu 2 số--");
				int hieu = n - m;
				System.out.println("Hiệu " + n + " - " + m + " =" + hieu(m,n));
			} else if (luachon == 3) {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("--3. in ra số nào lớn hơn--");
				sosanh(m,n);
			} else if (luachon == 0) {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("cảm ơn đã sử dụng ");
				System.exit(0);
			} else {
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("vui lòng chọn từ (0-->3)");
			}
		} while (luachon != 0);
	}
	public static void luachon(int luachon) {
		
	}
	public static int tong(int a,int b) {
		return a+b;
	}
	public static int hieu(int a,int b) {
		return a-b;
	}
	public static void sosanh(int a,int b) {
		if (a > b) {
			System.out.println("số lớn nhất là : " + a);
		} else {
			System.out.println("số lớn nhât là : " + b);
		}
	}
}
