import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); 
            int size = 2 * n; 
            for (int i = 0; i < size; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    boolean isHashBlock = ((i / 2) + (j / 2)) % 2 == 0;
                    if (isHashBlock) {
                        line.append('#');
                    } else {
                        line.append('.');
                    }
                }
                System.out.println(line);
            }
        }
    }
}
