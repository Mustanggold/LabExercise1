import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the radius: ");
        input = scan.nextInt();
        System.out.println("The radius is: "+input +" The area is: " + input*input*Math.PI);
        scan.close();
    }
}
