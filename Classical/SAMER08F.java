import java.util.*;
import java.io.*;

public class SAMER08F {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int squares = (n*(n+1)*(2*n+1))/6;
            System.out.println(squares);
            n = sc.nextInt();
        }
    }
}
