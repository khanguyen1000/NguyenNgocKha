package lab3;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] array;
        Scanner s=new Scanner(System.in);
        System.out.print("số lượng phần tử trong Dẫy số n="); int n=s.nextInt();
        array=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("n["+(i+1)+"] =");
            array[i]=s.nextInt();
            System.out.println();
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println("\nsố nhỏ nhất:"+array[0]);
        int j=0,sum=0;
        for(int i=0; i<n;i++)
        {
          if (array[i]%3==0)
          {
              j++;
              sum=sum+array[i];
          }
        }
        System.out.println("TB cộng các số chia hết cho 3:"+(sum/j));
    }
}
