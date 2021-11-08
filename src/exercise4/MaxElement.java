package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter size");
        int size=input.nextInt();
        double [] numbers=new double[size];


        System.out.println("Enter numbers:");
        for(int i=0;i<size;i++){
            numbers[i]=input.nextDouble();
        }

        double max=numbers[0];
        for(int i=1;i<numbers.length;i++) {
            /*if(numbers[i]>max){
            max=(numbers[i]);
        }*/
            max=Math.max(max,numbers[i]);
        }
        System.out.println( "Max number: "+max );

        //Arrays .stream(numbers).max().getAsDouble()

    }
}
