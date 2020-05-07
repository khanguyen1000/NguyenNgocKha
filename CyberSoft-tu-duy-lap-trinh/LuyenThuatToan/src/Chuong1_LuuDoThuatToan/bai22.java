package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai22 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int T=1;
		//nhập dữ liệu
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				T*=i;
				System.out.print(" "+i+" " );
			}
		}
		System.out.println();
		//đầu ra 
		System.out.println(" tích tất cả “ước số” của số nguyên dương n :"+T);
	}

}
