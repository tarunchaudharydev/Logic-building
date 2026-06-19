package patterns;
import java.util.Scanner;

public class Pattern4 {
    public static void Pattern(int row, int col){
        for(int i = row; i > 0; i--){
            for(int j = col; j > 0; j--){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = input.nextInt();

        System.out.print("Enter column: ");
        int col = input.nextInt();

        Pattern(row,col);


    }
}
