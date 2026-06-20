package patterns;
import java.util.Scanner;

public class Pattern6 {
    public static void Pattern(int row, int col){

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                System.out.print(col+" ");
                col++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = input.nextInt();

        System.out.print("enter start point: ");
        int start = input.nextInt();

        Pattern(row,start);
    }
}
