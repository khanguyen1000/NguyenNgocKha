package NguyenNgocKha_buoi4;

public class bai1 {
	public static void main(String[] args) {
		// đầu vào
		int n = 0;
		int tog = 0;
		// xử lý
		while (true) { //điều kiện lập
			tog += n;
			
			if(tog>5000) {
				break;
			}
			n++;
		}
		// đầu ra
		System.out.println(tog);
		System.out.println(n);
	}
}
