package NguyenNgocKha_buoi7;

import java.util.LinkedList;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		LinkedList<Integer> listSo = new LinkedList<Integer>();
		menu(sn, listSo);

	}

	public static void menu(Scanner sn, LinkedList<Integer> listSo) {

		do {
			int luachon;
			System.out.println("____________________________________________________");
			System.out.println();
			System.out.println("1. Thêm 1 số vào danh sách");
			System.out.println();
			System.out.println("2. Thêm số liên tục, nhập số 0 thì dừng");
			System.out.println();
			System.out.println("3. Xuất ra các số đã nhập");
			System.out.println();
			System.out.println("4. Tính tổng các số đã nhập ");
			System.out.println();
			System.out.println("5. Đổi chỗ 2 số theo vị trí");
			System.out.println();
			System.out.println("6. Xóa 1 số theo vị trí");
			System.out.println();
			System.out.println("7. Tìm số âm lớn nhất trong các số đã nhập");
			System.out.println();
			System.out.println("8. Sắp xếp các số theo thứ tự tăng dần");
			System.out.println();
			System.out.println("0. Thoát ");
			System.out.println();
			System.out.println("lua chọn :");
			luachon = Integer.parseInt(sn.nextLine());
			switch (luachon) {
			case 0: {
				// 0. Thoát
				System.exit(0);
				break;
			}
			case 1: {
				// 1. Thêm 1 số vào danh sách
				System.out.println();
				NhapMotSo(sn, listSo);
				break;
			}
			case 2: {
				// 2. Thêm số liên tục, nhập số 0 thì dừng
				System.out.println();
				NhapKhongThiDung(sn, listSo);
				break;
			}
			case 3: {
				// 3. Xuất ra các số đã nhập
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else {
					xuatList(listSo);
				}

				break;
			}
			case 4: {
				// 4. Tính tổng các số đã nhập
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else {
					System.out.println("tổng các số : " + tongCacSo(listSo));
				}
				break;
			}
			case 5: {
				// 5. Đổi chỗ 2 số theo vị trí
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else
					doiCho2SotheoViTri(sn, listSo);
				break;
			}
			case 6: {
				// 6. Xóa 1 số theo vị trí
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else {
					xoaViTri(sn, listSo);
				}

				break;
			}
			case 7: {
				// 7. Tìm số âm lớn nhất trong các số đã nhập
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else {
					soAmLonNhat(sn, listSo);
				}
				break;
			}
			case 8: {
				// 8. Sắp xếp các số theo thứ tự tăng dần
				System.out.println();
				if (listSo.size() == 0) {
					System.out.println("không có số nào trong List Số");
				} else {
					sapXepTangDan(listSo);
				}
				break;
			}
			default: {
				System.out.println("vui lòng chọn số từ 0-8 trên menu");
				break;
			}
			}

			if (luachon == 0) {
				break;
			} else {
				System.out.println();
				System.out.println("----------------nhấn enter để thực hiện các lựa chọn khác -------");
				sn.nextLine();
			}
		} while (true);
	}

	public static void NhapMotSo(Scanner sn, LinkedList<Integer> listSo) {
		// đầu vào
		int n;
		// nhập dữ liệu
		System.out.println("số n cần thêm vào List : ");
		n = Integer.parseInt(sn.nextLine());
		listSo.add(n);
	}

	public static void NhapKhongThiDung(Scanner sn, LinkedList<Integer> listSo) {
		while (true) {
			int n;
			System.out.print("mời nhập :  ");
			n = Integer.parseInt(sn.nextLine());
			if (n == 0) {
				break;
			} else {
				listSo.add(n);
			}
		}
	}

	public static void xuatList(LinkedList<Integer> listSo) {
		for (int i = 0; i < listSo.size(); i++) {
			System.out.print("[" + listSo.get(i) + "]" + (i == listSo.size() - 1 ? "\n" : ","));
		}
	}

	public static int tongCacSo(LinkedList<Integer> listSo) {
		int tog = 0;
//		for (int i = 0; i < listSo.size(); i++) {
//			tog += listSo.get(i);
//		}
		for (int so : listSo) {
			tog += so;
		}
		return tog;

	}

	public static void hoanVi(int n, int m, LinkedList<Integer> listSo) {
		int t = listSo.get(n);
		listSo.set(n, listSo.get(m));
		listSo.set(m, t);
	}

	public static void doiCho2SotheoViTri(Scanner sn, LinkedList<Integer> listSo) {
		System.out.println("List trước khi hoán đổi :");
		xuatList(listSo);
		System.out.println("nhập vị trí 1 , 2 cần đổi chỗ");
		int n, m;
		while (true) {
			System.out.print("vị trí 1 : ");
			n = Integer.parseInt(sn.nextLine());
			System.out.print("vị trí 2 : ");
			m = Integer.parseInt(sn.nextLine());
			if ((n <= listSo.size() && n > 0) && (m <= listSo.size() && m > 0)) {
				break;
			} else {
				System.out.println("vui lòng nhập m và n lớn hơn 0 và bé hơn bằng độ dài của List ");
			}
		}
		hoanVi(n - 1, m - 1, listSo);
		System.out.println("sau khi đổi :");
		xuatList(listSo);
	}

	public static void xoaViTri(Scanner sn, LinkedList<Integer> listSo) {
		int n;
		xuatList(listSo);
		while (true) {
			System.out.print("nhập vi trí cần xoá :");
			n = Integer.parseInt(sn.nextLine());
			if (n > 0 && n <= listSo.size()) {
				break;
			} else {
				System.out.println("vi trí phải >0 và <= độ dài của list");
			}
		}
		listSo.remove(n - 1);
		System.out.println("sau khi xoá vị trí " + n);
		xuatList(listSo);
	}

	public static void soAmLonNhat(Scanner sn, LinkedList<Integer> listSo) {
		int vtammax = 0;
		for (int i = 0; i < listSo.size(); i++) {
			if (listSo.get(i) < 0) {
				vtammax = i;
				break;
			}
		}
		for (int i = 0; i < listSo.size(); i++) {
			if (listSo.get(i) < 0 && listSo.get(i) > listSo.get(vtammax)) {
				vtammax = i;
			}
		}
		System.out.println(
				(vtammax != 0 ? "số âm lớn nhất là :" + listSo.get(vtammax) : "không có số âm nào trong List"));
	}

	public static void sapXepTangDan(LinkedList<Integer> listSo) {
		System.out.println("trước khi sắp xếp :");
		xuatList(listSo);
		for (int i = 0; i < listSo.size(); i++) {
			for (int j = 0; j < listSo.size(); j++) {
				if (listSo.get(j) > listSo.get(i)) {
					hoanVi(j, i, listSo);
				}
			}
		}
		System.out.println("sau khi sắp xếp :");
		xuatList(listSo);
	}
}
