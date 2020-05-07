import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		//đầu vào 
		Scanner sn=new Scanner(System.in);
		float usd,vnd;
		//Nhập dữ liệu
		System.out.println("xin chào ");
		System.out.print("mời bạn nhập số usd cần quy đổi vnd :");
		usd=sn.nextFloat();
		//xử lý
		vnd=(float)usd*23500;
		//đầu ra 
		System.out.println(usd+" usd = "+vnd+" vnd");
	}
}
