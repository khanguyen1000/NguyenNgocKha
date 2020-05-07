package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai26 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn =new Scanner(System.in);
		int n;
		int T=1;
		//nhập dữ liệu
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+(i==n?"\n":" ,"));
				if(i%2!=0) {
					T*=i;
				}
			}
		}
		//đầu ra
		System.out.println(" tích tất cả “ước số lẻ” của số nguyên dương n :"+ T);
		

	}

}
