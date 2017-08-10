import java.util.*;

public class PRIME1 {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=a;i<=b;i++){
                if(isPrime(i)) System.out.println(i);
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if(num<=1) return false;
        if(num==2) return true;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
