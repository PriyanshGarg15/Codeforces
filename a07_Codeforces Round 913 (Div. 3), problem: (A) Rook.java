import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine();
        for (int testCase = 0; testCase < t; testCase++) {
            String position = scanner.nextLine();
            char column = position.charAt(0); 
            char row = position.charAt(1); 
            for (char r = '1'; r <= '8'; r++) {
                if (r != row) {
                    System.out.print(column + "" + r + " ");
                }
            }
            for (char c = 'a'; c <= 'h'; c++) {
                if (c != column) { 
                    System.out.print(c + "" + row + " ");
                }
            }
            System.out.println(); 
        }
    }
}
