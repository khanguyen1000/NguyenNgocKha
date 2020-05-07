package onClass;

import java.util.Scanner;

public class demoSwitchCase {
	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int n;
		int hangchuc,hangdonvi;
		String count="";
		//nhập dữ liệu
		System.out.print("nhập vào n :");
		n=sn.nextInt();
		//xử lý
		hangchuc=n/10;
		hangdonvi=n%10;
		switch(hangchuc){
			case 1:{
				count=count +"mười";
				break;
			}
			case 2:{ 
				count=count +"Hai mươi";
				break;
			}
			case 3:{ 
				count=count +"Ba mươi";
				break;
			}
			case 4:{ 
				count=count +"Bốn mươi";
				break;
			}
			case 5:{ 
				count=count +"Năm mươi";
				break;
			}
			case 6:{ 
				count=count +"Sáu mươi";
				break;
			}
			case 7:{ 
				count=count +"Bảy mươi";
				break;
			}
			case 8:{ 
				count=count +"Tám mươi";
				break;
			}
			case 9:{ 
				count=count +"Chín mươi";
				break;
			}
		}
		switch(hangdonvi){
			case 1:{
				if(hangchuc==1) {
					count=count +" một";
				}else {
					count=count +" mốt";
				}
				break;
			}
			case 2:{ 
				count=count +" Hai";
				break;
			}
			case 3:{ 
				count=count +" Ba";
				break;
			}
			case 4:{ 
				if(hangchuc==1)
					count=count +" Bốn";
				else
					count=count +" tư";
				break;
			}
			case 5:{ 
				if(hangchuc==0)
				count=count +" Năm ";
				else{
					count=count+" lăm";
				}
				break;
			}
			case 6:{ 
				count=count +" Sáu";
				break;
			}
			case 7:{ 
				count=count +" Bảy";
				break;
			}
			case 8:{ 
				count=count +" Tám";
				break;
			}
			case 9:{ 
				count=count +" Chín";
				break;
			}
		}
		//đầu ra
		System.out.println(count);
	}
}
