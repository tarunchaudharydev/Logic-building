package patterns;
import java.util.Scanner;

public class Pattern8 {
    public static void Pattern(int a, int b){
        b+=1;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
                System.out.print(b+" ");
                b+=2;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = input.nextInt();

        System.out.print("Enter start point: ");
        int start = input.nextInt();

        Pattern(row, start);
    }
}
