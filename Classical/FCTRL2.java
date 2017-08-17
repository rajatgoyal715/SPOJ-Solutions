import java.util.*;
import java.math.*;

public class FCTRL2 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int num = sc.nextInt();
            BigInteger fac = new BigInteger("1");
            BigInteger temp;
            for(int i=1;i<=num;i++){
                temp = new BigInteger(i+"");
                fac = fac.multiply(temp);
            }
            System.out.println(fac);
        }
    }
}
