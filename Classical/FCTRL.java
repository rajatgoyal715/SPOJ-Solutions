import java.util.*;

public class FCTRL {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int num = sc.nextInt();
            int count = 0;
            while(num!=0){
                count += num/5;
                num /= 5;
            }
            System.out.println(count);
        }
    }
}
