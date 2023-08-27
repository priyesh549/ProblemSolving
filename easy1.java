import java.util.*;

public class easy1 {
    public static String solve(int n){
        int fact = 0;

        for(int i=1;i<n;i++){
            if(n%i == 0){
                fact += i;
            }
        }

        if(fact == n){
            return "Perfect";
        }
        else if(fact > n){
            return "Abundant";
        }
        else{
            return "Deficient";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
}
