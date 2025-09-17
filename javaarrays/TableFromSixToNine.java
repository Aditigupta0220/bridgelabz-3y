import java.util.Scanner;

public class TableFromSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4]; // For 6 to 9

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}
