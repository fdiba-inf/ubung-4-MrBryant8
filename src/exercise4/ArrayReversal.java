package exercise4;



import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size");
        int size = input.nextInt();
        char[] symbols = new char[size];
        int i;

        System.out.println("Enter symbols:");
        for (i = 0; i < size; i++) {
            symbols[i] = input.next().charAt(0);
        }

        /*int n=0;
        String[] symReversed=new String[size];
        for (int j = symbols.length-1; j >=0 ; j--) {
            symReversed[n]=String.valueOf(symbols[j]);
            n++;
        }
        String wtf=String.join(", ",symReversed);
        System.out.println("Reversed symbols: ["+wtf+"]");
         */

        /*System.out.print("Reversed symbols: [");
        for ( i = symbols.length-1; i >=0 ; i--) {
            System.out.print(symbols[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.print("]");*/

        char[] reversedSymbols = new char[size];
        int reversedIndex=0;
        for (i = symbols.length - 1; i >= 0; i--) {
            reversedSymbols[reversedIndex]=symbols[i];
            reversedIndex++;
        }
        String reversedString=Arrays.toString(reversedSymbols);
        System.out.println("Reversed symbols: "+reversedString);

    }
}

