import java.util.*;
import java.io.*;

public class ONP {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String s = sc.nextLine();
            int l = s.length();
            Stack<Character> stack = new Stack<>();
            String post = "";
            for(int i=0;i<l;i++){
                char c = s.charAt(i);
                if(c==')'){
                    post += stack.pop();
                } else if(c=='*' || c=='/' || c=='+' || c=='-' || c=='^'){
                    stack.push(c);
                } else if(c=='('){
                    // do nothing
                } else{
                    post += c;
                }
                // System.out.println("Expression at " + i + " is " + post);
            }
            System.out.println(post);
        }
    }
}
