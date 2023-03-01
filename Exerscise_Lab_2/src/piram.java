import java.util.Scanner;

public class piram {

    public static void main(String[] args) {
        System.out.println("Enter number of lines: ");

        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++) {
                System.out.print("*");
            }
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
