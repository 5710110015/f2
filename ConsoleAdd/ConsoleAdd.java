import java.util.Scanner;

public class ConsoleAdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int x = sc.nextInt();
        System.out.print("Enter second integer : ");
        int y = sc.nextInt();

        sc.close();
        System.out.println("Adding Gives : " + (y+x) );
    }
}