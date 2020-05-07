package onClass;

import java.util.Scanner;

public class demoifelseif {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		float dtb;
		//nhập dữ liệu 
		System.out.println("nhập điểm tb: ");
		dtb=sn.nextFloat();
		//đầu ra
		if(dtb>=8) {
			System.out.println("học sinh giỏi");
		}else if(dtb>=5) {
			System.out.println("qua môn");
		}else {
			System.out.println("thi lại");
		}
	}
}
