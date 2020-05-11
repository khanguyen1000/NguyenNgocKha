package QLNS;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		CongTy cty = new CongTy();
		Scanner sn = new Scanner(System.in);
		// cty.themNS();
		
		do {
			System.out.println();
			System.out.println("1. Nhập thông tin công ty ");
			System.out.println();
			System.out.println("2. Thêm một nhân sự");
			System.out.println();
			System.out.println("3. Xóa một nhân sự");
			System.out.println();
			System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
			System.out.println();
			System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
			System.out.println();
			System.out.println("6. Tìm Trưởng Phòng có lương cao nhất");
			System.out.println();
			System.out.println("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
			System.out.println();
			System.out.println("8. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
			System.out.println();
			System.out.println("9. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
			System.out.println();
			System.out.println("0. thoát ");
			System.out.println();
			System.out.println("lựa chọn : ");
			int lc = Integer.parseInt(sn.nextLine());
			switch (lc) {
				case 1: {
					System.out.println("------------------------------------------------");
					System.out.println("Nhập thông tin công ty ");
					System.out.println("------------------------------------------------");
					System.out.println();
					cty.nhapTTCty();
					cty.nhapDSNS();
					break;
				}
				case 2: {
					System.out.println("------------------------------------------------");
					System.out.println("Thêm một nhân sự");
					System.out.println("------------------------------------------------");
					cty.themNS();
					System.out.println();
					break;
				}
				case 3: {
					System.out.println("------------------------------------------------");
					System.out.println("Xóa một nhân sự");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("------------------------------------------------");
					System.out.println(" công ty "+cty.getTenCty());
					System.out.println("Thông tin toàn bộ Nhân viên");
					System.out.println("------------------------------------------------");
					cty.xuatDSNS();
					System.out.println();
					break;
				}
				case 5: {
					System.out.println("------------------------------------------------");
					System.out.println("Tổng lương công ty phải trả cho nhân sự :");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 6: {
					System.out.println("------------------------------------------------");
					System.out.println("Trưởng Phòng có lương cao nhất :");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 7: {
					System.out.println("------------------------------------------------");
					System.out.println("Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất :");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 8: {
					System.out.println("------------------------------------------------");
					System.out.println("Giám Đốc có số lượng cổ phần nhiều nhất : ");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 9: {
					System.out.println("------------------------------------------------");
					System.out.println("Tổng THU NHẬP của từng Giám Đốc");
					System.out.println("------------------------------------------------");
					System.out.println();
					break;
				}
				case 0: {
					System.out.println();
					System.out.println("------------------------------------------------");
					System.out.println(" cảm ơn đã sử dụng  ");
					System.out.println();
					System.out.println("------------------------------------------------");
					break;
				}
				default: {
					System.out.println("___________________________________________________");
					System.out.println();
					System.out.println("-------------vui lòng chọn 0-9---------------------");
					System.out.println("___________________________________________________");
					break;
				}
				
			}
			if(lc==0) {
				break;
			}else {
				System.out.println("___________________________________________________");
				System.out.println();
				System.out.println("vui lòng nhấn phím enter để tiếp tục ");
				System.out.println("___________________________________________________");
				sn.nextLine();
				
			}
			
		} while (true);
	}

}
