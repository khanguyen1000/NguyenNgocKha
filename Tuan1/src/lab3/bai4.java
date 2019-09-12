package lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Số lượng n sinh vien :");
        int n = s.nextInt();
        String[] hoTen = new String[n];
        float[] diemTb = new float[n];

        for (int i = 0; i < n; i++) {
            s = new Scanner(System.in);
            System.out.print("nhâp tên sv" + (i + 1) + ": ");
            hoTen[i] = s.nextLine();
            for(;;){
                System.out.print("nhập điểm sv 0<x<10:" + (i + 1) + ": ");
                diemTb[i] = s.nextFloat();
                if(diemTb[i]>=0&&diemTb[i]<=10) {
                   break;
                }
                else
                    System.out.println("(error)Lỗi nhập lại!!");

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Tên: " + hoTen[i]);
            System.out.println("Điểm: " + diemTb[i]);
            if (diemTb[i] < 5)
                System.out.println("Học Lực: Yếu");
            else if (diemTb[i] < 6.5)
                System.out.println("Học Lực: TB");
            else if (diemTb[i] < 7.5)
                System.out.println("Học Lực: Khá");
            else if (diemTb[i] < 9)
                System.out.println("Học Lực: Giỏi");
            else
                System.out.println("Học Lực: Xuất sắc");
        }
        for(int i =0; i<n-1;i++)
         {
             for (int j=i+1;j<n;j++)
             {
                 if(diemTb[i]>diemTb[j])
                 {
                     float temp=diemTb[i];
                        diemTb[i]=diemTb[j];
                        diemTb[j]=temp;
                        String tep=hoTen[i];
                        hoTen[i]=hoTen[j];
                        hoTen[j]=tep;

                 }
             }

         }
         for(int i=0;i<n;i++)
         {
             System.out.println("--------------------");
             System.out.println("Tên: " + hoTen[i]);
             System.out.println("Điểm: " + diemTb[i]);
         }

    }
}
