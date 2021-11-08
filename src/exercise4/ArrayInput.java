package exercise4;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter size:");
        int size=input.nextInt();
        int[] numbers=new int[size];

        System.out.println("Enter number:");
        for (int index=0;index<numbers.length;index++){
            numbers[index]=input.nextInt();
        }

        String numbAsString = Arrays.toString(numbers);
        System.out.println("Numbers: "+ numbAsString);

    }
}
