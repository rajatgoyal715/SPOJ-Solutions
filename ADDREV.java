import java.util.*;

public class ADDREV {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(rev(rev(n1) + rev(n2)));
        }
    }

    public static int rev(int n) {
        int num = 0;
        while(n != 0) {
            num = num*10 + n%10;
            n /= 10;
        }
        return num;
    }
}
