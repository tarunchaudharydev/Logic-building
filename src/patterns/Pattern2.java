package patterns;
import java.util.Scanner;

public class Pattern2 {
    public static void printPattern(int row, int column){
        for(int i = 1; i<row; i++){
            for(int j = 1; j<column; j++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row = input.nextInt();

        System.out.print("Enter Column: ");
        int column = input.nextInt();

        printPattern(5,5);
    }
}
