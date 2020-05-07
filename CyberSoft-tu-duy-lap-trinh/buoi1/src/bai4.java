import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		//đầu vào 
		Scanner sn =new Scanner(System.in);
		float cr,dt,cv,cd;
		//nhập dữ liệu
		System.out.println("xin chào :");
		System.out.println("mời nhập vào chiều dài và chiều rộng ");
		System.out.print("nhập vào chiều dài :");
		cd=sn.nextFloat();
		System.out.print("nhập vào chiều rộng :");
		cr=sn.nextFloat();
//		xử lý
		dt=cd*cr;
		cv=(cd+cr)*2;
		//đầu ra 
		System.out.println("diện tích : "+dt);
		System.out.println("chu vi : "+cv);
		
	}

}
