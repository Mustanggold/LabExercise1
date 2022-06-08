import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.print("Input the cents: ");
        input = scan.nextInt();
        System.out.println("The value is " + input/100 + " dollars and " + input%100 + " cents.");
        scan.close();
    }
}
