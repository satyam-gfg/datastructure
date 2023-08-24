//WAP to accept a 3 int from the user and print5
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && c > b) {
            System.out.print("true");
        } else {
            System.out.println("false");
        }
    }
}