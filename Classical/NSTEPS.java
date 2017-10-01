import java.util.*;
import java.io.*;

public class NSTEPS {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int x = sc.nextInt();
            int y  =sc.nextInt();
            String ans = (x==y) ? ((x%2==0) ? (x+y)+"" : (x+y-1)+"") : ((x==y+2) ? ((x%2==0) ? (x+y)+"" : (x+y-1)+"") : "No Number");
            System.out.println(ans);
        }
    }
}
