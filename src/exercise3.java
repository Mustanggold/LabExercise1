import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.print("Input a number: ");
        input = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(input + " x " + i + " = " + input*i + " ");
        }
        scan.close();
    }
}
