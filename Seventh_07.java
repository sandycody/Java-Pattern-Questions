import java.util.Scanner;

public class Seventh_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number of rows to be printed: ");
        int num = s.nextInt();
        
        System.out.println(" ");
        for (int i = 0; i <= num-1; i++) {
            char k = 'A';
            for (int j = 0; j <= num -1; j++) {
                if (j >= i) {
                    System.out.print(k++);
                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");     

    }
}
