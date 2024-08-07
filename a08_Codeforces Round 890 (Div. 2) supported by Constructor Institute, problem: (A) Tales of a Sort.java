import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt(); 
            }
            int maxOperations = 0;
            int currentMax = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    currentMax = Math.max(currentMax, a[i - 1]);
                }
            }
            System.out.println(currentMax);
        }
    }
}
