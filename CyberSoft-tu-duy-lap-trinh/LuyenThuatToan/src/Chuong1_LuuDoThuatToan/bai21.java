package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai21 {

	public static void main(String[] args) {
		//dau vao
		Scanner sn =new Scanner(System.in);
		int n;
		int S=0;
		//nhập dữ liệu
		
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+" ");
				
				S+=i;
			}
		}
		System.out.println();
		//dau ra
		System.out.println("tổng tất cả ước số của số nguyên dương n :"+S);
	}

}
