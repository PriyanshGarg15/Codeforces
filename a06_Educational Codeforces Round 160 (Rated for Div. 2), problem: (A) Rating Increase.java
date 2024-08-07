import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        for (int testCase = 0; testCase < t; testCase++) {
            String s = scanner.nextLine(); 
            String a = "";
            boolean found = false;
            int n = s.length();
            for (int i = 0; i < n - 1; i++) {
                a += s.charAt(i);
                String b = s.substring(i + 1);
                if (b.charAt(0) == '0') {
                    continue;
                }
                if (Integer.parseInt(a) < Integer.parseInt(b)) {
                    found = true;
                    System.out.println(a + " " + b);
                    break;
                }
            }
            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
