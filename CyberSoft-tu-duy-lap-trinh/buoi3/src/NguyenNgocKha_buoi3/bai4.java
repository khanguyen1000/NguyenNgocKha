package NguyenNgocKha_buoi3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		//A-Z từ 65 đến 90 trong ACSII
		//a-z từ 97 đên 122 trong ACSII
		//đầu vào
		Scanner sn=new Scanner(System.in);
		String s = "";
        String temp="";
        //nhap dữ liệu
        System.out.println("nhập vào 1 chuỗi ký tự (tối đa 6 ký tự) viết hoa thường lẫn lộn");
        System.out.print("chuỗi : ");
        s=sn.nextLine();
        char[] sc = s.toCharArray();
		int i=0;
		while(i<s.length()) {
			if(sc[i] >= 65 && sc[i] <= 90)
	        {
				temp += (char)(sc[i] += 32);
	        }else {
	        	temp+=(char)(sc[i]);
	        }
			i++;
		}
		
		System.out.println("độ dài chuỗi : "+s.length());
		System.out.println("chuỗi ban đầu: "+s);
		System.out.println("sau khi đổi : "+temp);
	}
}
