package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		//đầu vào 
		Scanner sn=new Scanner(System.in);
		String nameSv_1,nameSv_2,nameSv_3;
		int yearSv_1,yearSv_2,yearSv_3;
		int namhienhanh=2020;
		//nhập dữ liệu
		System.out.println("----mời bạn nhâp thông tin----");
		System.out.println("Sinh vien 1 :");
		System.out.print("tên :");
		nameSv_1=sn.nextLine();
		System.out.print("năm sinh: ");
		yearSv_1=sn.nextInt();
		sn.nextLine();
		System.out.println("Sinh vien 2 :");
		System.out.print("tên :");
		nameSv_2=sn.nextLine();
		System.out.print("năm sinh: ");
		yearSv_2=sn.nextInt();
		sn.nextLine();
		System.out.println("Sinh vien 3 :");
		System.out.print("tên :");
		nameSv_3=sn.nextLine();
		System.out.print("năm sinh: ");
		yearSv_3=sn.nextInt();
		sn.nextLine();
		//đầu ra
		
		if(yearSv_2>yearSv_1 && yearSv_2>yearSv_3) {
			System.out.println("tên : " +nameSv_2);
			System.out.println("tuổi : "+(namhienhanh-yearSv_2));
			if(yearSv_1>yearSv_3) {
				System.out.println("tên : " +nameSv_1);
				System.out.println("tuổi : "+(namhienhanh-yearSv_1));
				System.out.println("tên : " +nameSv_3);
				System.out.println("tuổi : "+(namhienhanh-yearSv_3));
			}else {
				System.out.println("tên : " +nameSv_3);
				System.out.println("tuổi : "+(namhienhanh-yearSv_3));
				System.out.println("tên : " +nameSv_1);
				System.out.println("tuổi : "+(namhienhanh-yearSv_1));
			}
			
		}else if(yearSv_3>yearSv_1 && yearSv_3>yearSv_1) {
			System.out.println("tên : " +nameSv_3);
			System.out.println("năm sinh : "+yearSv_3);
			if(yearSv_1>yearSv_2) {
				System.out.println("tên : " +nameSv_1);
				System.out.println("tuổi : "+(namhienhanh-yearSv_1));
				System.out.println("tên : " +nameSv_2);
				System.out.println("tuổi : "+(namhienhanh-yearSv_2));
			}else {
				System.out.println("tên : " +nameSv_2);
				System.out.println("tuổi : "+(namhienhanh-yearSv_2));
				System.out.println("tên : " +nameSv_1);
				System.out.println("tuổi : "+(namhienhanh-yearSv_1));
			}
		}else {
			System.out.println("sinh viên trẻ nhất là :");
			System.out.println("tên : " +nameSv_1);
			System.out.println("năm sinh : "+yearSv_1);
			if(yearSv_2>yearSv_3) {
				System.out.println("tên : " +nameSv_2);
				System.out.println("tuổi : "+(namhienhanh-yearSv_2));
				System.out.println("tên : " +nameSv_3);
				System.out.println("tuổi : "+(namhienhanh-yearSv_3));
			}else {
				System.out.println("tên : " +nameSv_3);
				System.out.println("tuổi : "+(namhienhanh-yearSv_3));
				System.out.println("tên : " +nameSv_2);
				System.out.println("tuổi : "+(namhienhanh-yearSv_2));
			}
		}
	}
}
