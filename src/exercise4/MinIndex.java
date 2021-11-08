package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter size:");
        int size=input.nextInt();
        double[] number=new double[size];
        int i;

        System.out.println("Enter numbers:");
        for(i=0;i<size;i++){
            number[i]=input.nextDouble();
        }

        int minI=0;
        for(i=1;i<number.length;i++){
            if(number[minI]>number[i]){
            minI=i;
            }
        }
        System.out.println("Min index: " +minI);
    }
}
