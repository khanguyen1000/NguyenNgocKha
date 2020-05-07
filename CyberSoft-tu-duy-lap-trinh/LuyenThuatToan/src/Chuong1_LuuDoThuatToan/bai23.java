package Chuong1_LuuDoThuatToan;

import java.util.Scanner;

public class bai23 {

	public static void main(String[] args) {
		//đầu vào 
		Scanner sn=new Scanner(System.in);
		int n;
		int dem=0;
		//nhập dữ liệu
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		//xử lý
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+(i==n?"\n":" ,"));
				dem++;
			}
		}
		System.out.println();
		//đầu ra 
		System.out.println(" số lượng “ước số” của số nguyên dương n :"+dem);

	}

}
