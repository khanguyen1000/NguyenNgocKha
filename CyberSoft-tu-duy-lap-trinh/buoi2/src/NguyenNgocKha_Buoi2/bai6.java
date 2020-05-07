package NguyenNgocKha_Buoi2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		//đầu vào 
		Scanner sn=new Scanner(System.in);
		int n;
		int n_HangChuc,n_HangDonVi;
		String cout="";
		//nhập vào 
		System.out.println("---mời bạn nhập vào 1 số nguyên với 2 chữ số (22,32,41)---");
		System.out.print("số n :");
		n=sn.nextInt();
		//xử lý
		n_HangChuc=n/10;
		n_HangDonVi=n%10;
		if(n_HangChuc==1) {
			cout=" mười ";

		}else if(n_HangChuc==2) {
			cout=" hai mươi ";

		}else if(n_HangChuc==3) {
			cout=" ba mươi ";

		}else if(n_HangChuc==4) {
			cout=" bốn mươi ";

		}else if(n_HangChuc==5) {
			cout=" năm mươi ";

		}else if(n_HangChuc==6) {
			cout=" sáu mươi ";

		}else if(n_HangChuc==7) {
			cout=" bảy mươi ";

		}else if(n_HangChuc==8) {
			cout=" tám mươi ";

		}else if(n_HangChuc==9) {
			cout = " chín mươi ";
		}else if(n_HangChuc==0){
			cout="";
		}
		if(n_HangDonVi==1) {
			if(n_HangChuc==1)
				cout=cout+"một";
			else
				cout=cout+"mốt";
		}else if(n_HangDonVi==2) {
			cout=cout+"hai";
		}else if(n_HangDonVi==3) {
			cout=cout+"ba";
		}else if(n_HangDonVi==4) {
			if (n_HangChuc==1)
			cout=cout+"bốn";
			else{
				cout=cout+"tư";
			}
		}else if(n_HangDonVi==5) {
			if(n_HangChuc==0){
				cout=cout+" Năm";
			}else{
				cout=cout+"lăm";
			}
		}else if(n_HangDonVi==6) {
			cout=cout+"sáu";
		}else if(n_HangDonVi==7) {
			cout=cout+"bảy";
		}else if(n_HangDonVi==8) {
			cout=cout+"tám";
		}else if(n_HangDonVi==9) {
			cout=cout+"chín";
		}
		// đầu ra
		System.out.println("cách đọc :" +cout);
	}
}
