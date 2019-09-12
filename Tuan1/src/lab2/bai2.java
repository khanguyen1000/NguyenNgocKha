package lab2;

import java.util.Scanner;

public class bai2 {
    public bai2(){};
    public void PtBac2() {
        Scanner s=new Scanner(System.in);
        System.out.print("Hệ số a :"); float a= s.nextFloat();
        System.out.print("Hệ số b :"); float b= s.nextFloat();
        System.out.print("Hệ số c :"); float c= s.nextFloat();
        if (a==0)
        {
            if (b==0)
            {
                if (c==0)
                System.out.println("Pt vô số nghiệm");
                else
                    System.out.println("Pt vô nghiệm");
            }
            else
                System.out.println("x :"+-c/b);
        }
        else
        {
            float delta=(float)(Math.pow(b,2)-4*a*c);
            if(delta<0)
                System.out.println("Pt Vô Nghiệm");
            else if(delta==0)
                System.out.println("Pt có Nghiệm kép x:"+-b/(2*a));
            else
            {
                System.out.println("Pt có 2 nghiệm:");
                System.out.println("X1="+(-b+Math.sqrt(delta))/(2*a));
                System.out.println("X2="+(-b-Math.sqrt(delta))/(2*a));
            }
        }
    }
}
