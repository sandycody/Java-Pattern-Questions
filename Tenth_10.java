import java.util.Scanner;

public class Tenth_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number of rows to be printed: ");
        int num = s.nextInt();
        
        System.out.println(" ");
        for (int i = 0; i <= num-1; i++) {
            for (int j = 0; j <= num -1; j++) {
                if ((i == 0 || i == (num - 1)) || (j == 0 || j == (num - 1))) {
                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");     

    }
}
