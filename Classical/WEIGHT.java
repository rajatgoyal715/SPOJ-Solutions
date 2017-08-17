import java.util.*;

public class WEIGHT {

    //backtracking solution - O(n^2) time complexity
    static int max = Integer.MIN_VALUE;
    static int w[];

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            w = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int sum = a[0];
            w[0] = 1;
            weight(a, 1, sum);
            System.out.println(max);
        }
    }

    public static void weight(int a[], int index, int sum) {
        if(index>=a.length){
            if(sum>max) max = sum;
            return;
        }

        w[index] = 2;
        weight(a, index+1, sum + w[index]*a[index]);

        w[index] = w[index-1] + 1;
        weight(a, index+1, sum + w[index]*a[index]);
    }
}
