package NguyenNgocKha_buoi5;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// đầu vào
		Scanner sn = new Scanner(System.in);
		int n;
		int[] arr;
		// nhap du lieu
		do {
			System.out.println("nhập vào n số nguyên ");
			System.out.print("n =");
			n = sn.nextInt();
			if (n > 0) {
				break;
			} else {
				System.out.println("vui lòng nhập n > 0");
			}
		} while (true);

		arr = new int[n];
		nhapMang(arr, sn);
		menu(arr, sn);
	}

	public static void nhapMang(int[] arr, Scanner sn) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("a[ " + (i + 1) + "] : ");
			arr[i] = sn.nextInt();
			System.out.println();
		}
	}

	public static void xuatMang(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("a[ " + (i + 1) + "] : " + arr[i]);
			System.out.println();
		}
	}

	public static void menu(int[] arr, Scanner sn) {
		do {
			System.out.println("__________________________________________________________________________");
			System.out.println();
			System.out.println("0. thoát");
			System.out.println();
			System.out.println("1. Tổng các số dương  trong mảng.");
			System.out.println();
			System.out.println("2. Đếm có bao nhiêu số dương trong mảng.");
			System.out.println();
			System.out.println("3. Tìm số nhỏ nhất trong mảng.");
			System.out.println();
			System.out.println("4. Tìm số dương nhỏ nhất trong mảng");
			System.out.println();
			System.out.println("5. Tìm số chẵn cuối cùng trong mảng.");// Nếu mảng không có giá trị chẵn thì trả về -1.
			System.out.println();
			System.out.println("6. Đổi chỗ 2 giá trị trong mảng theo vị trí .");// (Cho nhập vào 2 vị trí muốn đổi chỗ
																				// // giá
			System.out.println(); // trị)
			System.out.println("7. Sắp xếp mảng theo thứ tự tăng dần.");
			System.out.println();
			System.out.println("8 . Tìm số nguyên tố đầu tiên trong mảng.");// Nếu mảng không có số nguyên tố thì trả về
			System.out.println();
			System.out.println("9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?");
			System.out.println();
			System.out.println("10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.");
			System.out.println();
			System.out.print("lựa chọn : ");
			int luachon = sn.nextInt();
			switch (luachon) {
			case 0: {
				System.out.println("0-thoát");
				System.exit(0);
			}
			case 1: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("1. Tổng các số dương  trong mảng.");
				//đầu vào
				int tong = 0;
				//xử lý
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > 0) {
						tong += arr[i];
					}
				}
				//đầu ra
				System.out.println("tổng  = " + tong);
				break;
			}
			case 2: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("2.Đếm có bao nhiêu số dương trong mảng.");
				
				System.out.println("  số lượng số dương trong mảng : " + demsoduong(arr));
				break;
			}
			case 3: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("3. Tìm số nhỏ nhất trong mảng.");
				System.out.println("số nhỏ nhất trong mảng là: " + Min(arr));
				break;
			}
			case 4: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("4. Tìm số dương nhỏ nhất trong mảng");
				System.out.println("số dương nhỏ nhất trong mảng là: " + arr[DuongMin(arr)]);
				break;
			}
			case 5: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("5. Tìm số chẵn cuối cùng trong mảng.");
				System.out.println("số chẵn cuối cùng trong mảng là : " + ChanCuoi(arr));
				break;
			}
			case 6: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("6. Đổi chỗ 2 giá trị trong mảng theo vị trí .");
				System.out.println("vi tri a : ");
				int a = sn.nextInt();
				System.out.println("vi tri b : ");
				int b = sn.nextInt();
				HoanVi(a - 1, b - 1, arr);
				System.out.println();
				System.out.println("--sau khi hoan vi---");
				xuatMang(arr);
				break;
			}
			case 7: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("7. Sắp xếp mảng theo thứ tự tăng dần.");
				SapXepTangDan(arr);
				xuatMang(arr);
				break;
			}
			case 8: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("8 . Tìm số nguyên tố đầu tiên trong mảng.");
				if(SNTDautien(arr)==-1) 
					System.out.println("không có số nguyên tố ");
				else
				System.out.println("số nguyên tố đầu tiên trong mảng là: " + SNTDautien(arr));
				break;
			}
			case 9: {
				float[] b;
				int k;
				System.out.println();
				System.out.println("9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?");
				System.out.println("độ dài k mảng số thực b là :");
				do {
					System.out.print("k : ");
					k = sn.nextInt();
					if (k > 0) {
						break;
					} else {
						System.out.println("vui lòng nhập k > 0");
					}
				} while (true);
				b = new float[k];
				for (int i = 0; i < b.length; i++) {
					System.out.print("b[ " + (i + 1) + "] : ");
					b[i] = sn.nextFloat();
					System.out.println();
				}
				if (tkSNtrongMangST(b) == 0) {
					System.out.println("không có số nguyên nào trong mảng số thực này");

				} else {
					System.out.println("có " + tkSNtrongMangST(b) + " số nguyên trong mảng số thực này");
				}
				break;
			}
			case 10: {
				System.out.println("--------------------------------------------------------------------------");
				xuatMang(arr);
				System.out.println();
				System.out.println("10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.");
				SoSanhDuongAm(arr);
				break;
			}
			case 11:{
				System.out.println("xuat ta cac so duong ");
				xuatMang(mang(arr));
				break;
			}
			default: {
				System.out.println("vui long chon từ 0- 10");
				break;
			}
			}
			if(luachon==0) {
				break;
			}
		} while (true);

	}
	public static int demsoduong(int[] arr) {
		int dem = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				dem++;
			}
		}
		return dem;
	}
	public static int[] mang(int[] arr) {
		int[] b;
		int demsoduong=demsoduong(arr);
		b=new int[demsoduong];
		//xu ly
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]>0) {
				b[j]=arr[i];
				j++;
			}
		}
		return b;
	}
	public static int Min(int[] arr) {
		//tim thoe gia tri
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int DuongMin(int[] arr) {
		int vtmin = 0; //tim theo vitri
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				vtmin = i;
				break;
			}
		}
		for (int i = vtmin+1; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] < arr[vtmin]) {
				vtmin=i;
			}
		}
		return vtmin;
	}

	public static int ChanCuoi(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {
				return arr[i];

			}
		}
		return -1;
	}

	public static void HoanVi(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void SapXepTangDan(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					HoanVi(i, j, arr);
				}
			}
		}
	}

	public static int SoNguyenTo(int n) {
		if (n < 2)
			return 0;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return 0;
		return 1;
	}

	public static int SNTDautien(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (SoNguyenTo(arr[i]) == 1)
				return arr[i];
		return -1;
	}

	public static int tkSNtrongMangST(float[] b) {
		int dem = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] - (int) b[i] == 0) {
				dem++;
			}
		}
		return dem;
	}

	public static void SoSanhDuongAm(int[] arr) {
		int duong = 0, am = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				duong++;
			} else if (arr[i] < 0) {
				am++;
			}
		}
		System.out.println("số lượng số dương : " + duong);
		System.out.println("số lượng số âm : " + am);
		if (duong > am) {
			System.out.println("số lượng số dương > số lượng số âm");
		} else if (duong < am) {
			System.out.println("số lượng số âm > số lượng số dương");
		} else {
			System.out.println("số lượng số âm = số lượng số dương");
		}
	}
}
