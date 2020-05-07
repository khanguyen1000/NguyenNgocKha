package suaBT;

public class bai1_suaBT {

	public static void main(String[] args) {
		// đầu vào 
		int n=1;
		int total=0;
		//xử lý
		do {
			total+=n;
			if(total>10) {
				break;
			}
			n++;
		}while(true);//điều kiện dừng
		//đầu ra 
		System.out.println("số n cần tìm là : "+n);
		System.out.println("total :"+total);

	}

}
