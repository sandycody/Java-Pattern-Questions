import java.util.Scanner;

public class Third_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number of rows to be printed: ");
        int num = s.nextInt();
        
        System.out.println(" ");
        for (int i = 0; i <= num-1; i++) {
            for (int j = 0; j <= num -1; j++) {
                if (j <= (num - 1 - i)) {
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
