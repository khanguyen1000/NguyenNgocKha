package suaBT;

import java.util.Scanner;

public class bai3_suaBT {
    public static void main(String[] args) {
        //đầu vào
        Scanner sn=new Scanner(System.in);
        int so;
        int chan=0,le=0;
        //nhập dữ liệu
        System.out.println("mời bạn nhập 5 số : ");
        System.out.print("số thứ nhất : ");
        so=sn.nextInt();
        if(so%2==0){
            chan++;
        }
        System.out.print("số thứ hai : ");
        so=sn.nextInt();
        if(so%2==0){
            chan++;
        }
        System.out.print("số thứ ba : ");
        so=sn.nextInt();
        if(so%2==0){
            chan++;
        }
        System.out.print("số thứ tư : ");
        so=sn.nextInt();
        if(so%2==0){
            chan++;
        }
        System.out.print("số thứ năm : ");
        so=sn.nextInt();
        if(so%2==0){
            chan++;
        }
        //xử lý
        le=5-chan;
        //đầu ra
        System.out.println(" có  " +chan +" số chẵn trong năm số nguyên trên");
        System.out.println("có  " +le +" số lẻ trong năm số nguyên trên");
    }
}
