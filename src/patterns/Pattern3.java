package patterns;
import java.util.Scanner;

public class Pattern3 {
    public static void Pattern(int row, int column){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                System.out.print(j + " ");
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

        Pattern(5,5);
    }
}
