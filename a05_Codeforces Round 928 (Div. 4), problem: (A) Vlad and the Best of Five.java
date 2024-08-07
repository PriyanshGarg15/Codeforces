import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int testCase = 0; testCase < t; testCase++) {
            String input = scanner.nextLine();
            int countA = 0;
            int countB = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == 'A') {
                    countA++;
                } else if (ch == 'B') {
                    countB++;
                }
            }
            if (countA > countB) {
                System.out.println('A');
            } else {
                System.out.println('B');
            }
        }
 
    }
}
