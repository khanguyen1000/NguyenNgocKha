import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		//đầu vào 
		
		Scanner sn =new Scanner(System.in);
		
		double stb=0;
		//Nhập dữ liệu
		
		System.out.println("Xin chào.!! mời bạn nhập vào 5 số thực ");	
		System.out.println("số thứ nhất a: " ); stb=stb+sn.nextDouble();
		System.out.println("số thứ hai b: " ); stb=stb+sn.nextDouble();
		System.out.println("số thứ ba c: " );  stb=stb+sn.nextDouble();
		System.out.println("số thứ tư d: " );  stb=stb+sn.nextDouble();
		System.out.println("số thứ năm e: " );  stb=stb+sn.nextDouble();
		
		//xử lý
		
		stb=stb/5;
		
		
		// đầu ra 
		
		System.out.println("tổng trung bình của 5 số này là : "+ stb);
	}

}
