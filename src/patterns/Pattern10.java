package patterns;
import java.util.Scanner;

public class Pattern10 {
    public static void Pattern(int a, int b){
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b; j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = input.nextInt();

        System.out.print("enter column: ");
        int col = input.nextInt();

        Pattern(row, col);

    }
}
