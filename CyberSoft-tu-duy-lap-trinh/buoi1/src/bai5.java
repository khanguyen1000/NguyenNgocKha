import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in); 
		int s,so_hang_dv,so_hang_chuc,tong;
		//nhập dữ liệu 
		System.out.println("xin chào");
		for(;;) {
			System.out.println("mời nhập 1 số nguyên có 2 chữ số ví dụ (11,14,55) :");
			s=sn.nextInt();
			if(s>9&&s<100) {
				break;
			}else {
				System.out.println("vui long nhập lại");
			}
			
		}
		
		//xử lý
		so_hang_dv=s%10;
		so_hang_chuc=s/10;
		tong=so_hang_chuc+so_hang_dv;
		//xuất dữ liệu 
		System.out.println("Tổng "+so_hang_chuc+" + "+so_hang_dv+" = "+ tong );
	
	} 

}
