package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		// đầu vào
		Scanner sn =new Scanner(System.in);
		int m,n;
		//nhập dữ liệu
		System.out.println(" --mời nhập vào 2 số nguyên --");
		System.out.print(" m : ");
		m=sn.nextInt();
		System.out.println();
		System.out.print(" n : ");
		n=sn.nextInt();
		//đầu ra 
		if(m>n) {
			System.out.println("số lớn nhất là  m: " +m);
		}else if(n>m) {
			System.out.println("số lớn nhất là  n: "+n);
		}else{
			System.out.println("2 số bằng nhau ");
		}
		
	}
}
