package onClass;

import java.util.Scanner;

public class demoifelse {
	public static void main(String[] args) {
		
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		//nhập dữ liệu
		System.out.println("nhập số : ");
		n=sn.nextInt();
		//đầu ra
		if(n%2==0) {
			System.out.println("là số chẵn");
		}else {
			System.out.println("là số lẻ");
		}
	}

}
