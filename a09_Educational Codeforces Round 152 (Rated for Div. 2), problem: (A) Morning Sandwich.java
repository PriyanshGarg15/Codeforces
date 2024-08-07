import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int h = scanner.nextInt();
            
            if (b > c + h) {
                System.out.println(2 * (c + h) + 1);
            } else {
                System.out.println(2 * b - 1);
            }
        }
    }
}
