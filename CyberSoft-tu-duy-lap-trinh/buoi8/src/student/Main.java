package student;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		LinkedList<Student> listSv = new LinkedList<Student>();
		Student sv;
		String hoTen;
		double toan, van;
		int n;
		// nhập dữ liệu
		System.out.println("số lượng n học sinh n = ");
		n = Integer.parseInt(sn.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("học sinh  " + (i + 1) + " : ");
			System.out.print("nhập họ tên :");
			hoTen = sn.nextLine();
			System.out.print("nhập toán : ");
			toan = Double.parseDouble(sn.nextLine());
			System.out.print("nhập văn : ");
			van = Double.parseDouble(sn.nextLine());
			sv = new Student(hoTen, toan, van);
			listSv.add(sv);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("học sinh " + (i + 1) + ":");
			System.out.print("họ tên : ");
			listSv.get(i).getName();
			System.out.print("Toán :");
			listSv.get(i).getToan();
			System.out.print("Văn :");
			listSv.get(i).getVan();
			System.out.println();
		}

		// xử lý

		// đầu ra

	}

	public Student hocsinhCaoNhat(LinkedList<Student> listsv) {
		Student svMax = listsv.get(0);

		return svMax;
	}
}
