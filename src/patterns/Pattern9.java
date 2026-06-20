package patterns;
import java.util.Scanner;

public class Pattern9 {
    public static void Pattern(int a){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
                System.out.print(i*j +" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter start point: ");
        int start = input.nextInt();

        Pattern(start);

    }
}
