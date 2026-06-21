package patterns;
import java.util.Scanner;

public class Pattern11 {
    public static void Pattern(int a, int b){
        for(int i = 1; i<= a; i++){
            for(int j = 1; j<= a; j++){
                System.out.print(j+" "+i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = input.nextInt();

        System.out.print("enter col: ");
        int col = input.nextInt();

        Pattern(row, col);

    }
}
