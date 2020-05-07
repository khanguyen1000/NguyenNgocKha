package Chuong1_LuuDoThuatToan;

import java.util.LinkedList;
import java.util.Scanner;

public class bai29 {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int solenlonnhat=0;
		int dem=0;
		//nhập dữ liệu
		System.out.println("nhập n :");
		n=Integer.parseInt(sn.nextLine());
		
		//xử lý 
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				
				System.out.print(""+i+(i==n?"\n":" ,"));
				if(i%2!=0) {
					if(i>solenlonnhat) {
						solenlonnhat=i;
					}
				}
				}
			}
		
		//đầu ra 
		
		System.out.println("ước số lẻ lớn nhất của số nguyên dương n :"+solenlonnhat);
		
		
		
	}

}
