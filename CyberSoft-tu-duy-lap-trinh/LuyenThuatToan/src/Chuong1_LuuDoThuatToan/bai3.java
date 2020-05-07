package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn =new Scanner(System.in);
		int n;
		double S=0;
		
		//nhập dữ liệu
		
		System.out.println("nhập n :");
		n = Integer.parseInt(sn.nextLine());
		//xử lý
		
		for(int i=1;i<=n;i++) {
			float k=(float)1/i;
			S+=k;
		}
		//đầu ra
		System.out.println(" S= "+S );
		

	}
}
