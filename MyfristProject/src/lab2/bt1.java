package lab2;

import java.util.Scanner;

public class bt1 {
    public bt1(){};
    public  void Ptbac1() {
        Scanner s= new Scanner(System.in);
        System.out.print("Hệ Số a:"); float a= s.nextFloat();
        System.out.print("Hệ Số b:"); float b= s.nextFloat();
        float x= 0;
        if (a==0)
        {
            if (b==0)
                System.out.println("Vo so nghiem");
            else
                System.out.println("vo nghiem");
        }else
                System.out.println("X :"+-b/a);
    }
}
