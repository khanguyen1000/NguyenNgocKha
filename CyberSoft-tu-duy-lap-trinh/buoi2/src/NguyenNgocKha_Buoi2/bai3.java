package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		//đầu vào 
		Scanner sn=new Scanner(System.in);
		int so_1,so_2,so_3,so_4,so_5;
		int chan=0,le=0;
		//nhập dữ liệu 
		System.out.println("mời bạn nhập 5 số : ");
		System.out.print("số thứ nhất : ");
		so_1=sn.nextInt();
		System.out.print("số thứ hai : ");
		so_2=sn.nextInt();
		System.out.print("số thứ ba : ");
		so_3=sn.nextInt();
		System.out.print("số thứ tư : ");
		so_4=sn.nextInt();
		System.out.print("số thứ năm : ");
		so_5=sn.nextInt();
		//xử lý 
		if(so_1%2==0) {
			chan++;
		}else {
			le++;
		}
		if(so_2%2==0) {
			chan++;
		}else {
			le++;
		}
		if(so_3%2==0) {
			chan++;
		}else {
			le++;
		}
		if(so_4%2==0) {
			chan++;
		}else {
			le++;
		}
		if(so_5%2==0) {
			chan++;
		}else {
			le++;
		}
		//đầu ra 
		System.out.println(" có  " +chan +" số chẵn trong năm số nguyên trên");
		System.out.println("có  " +le +" số lẻ trong năm số nguyên trên");
	}
}
