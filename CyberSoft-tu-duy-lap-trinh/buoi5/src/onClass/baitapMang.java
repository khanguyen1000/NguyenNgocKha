package onClass;

import java.util.Scanner;

public class baitapMang {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int[] arr;
		//nhập dữ liệu 
		System.out.println("nhap n so nguyen :");
		System.out.println("n = ");
		n=sn.nextInt();
		arr=new int[n];
		nhapmang(arr,sn);
		xuatmang(arr);
	}
	public static void nhapmang(int[] arr,Scanner sn) {
		for(int i= 0;i<arr.length;i++) {
			System.out.println("số thứ "+(i+1)+":");
			arr[i]=sn.nextInt();
		}
	}
	public static void xuatmang(int[] arr) {
		for(int i= 0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"] = "+arr[i] );
		}
	}
}
