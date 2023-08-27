import java.util.*;

public class hard{
    public static ArrayList<String> solve(int n,int k,int g,int b){
        ArrayList<String> ans = new ArrayList<>();

        if(k == 0){
            return ans;
        }

        boolean s = true;
        while(n > 0){
            int copy = k;
            int cg = g;
            int cb = b;
            boolean isadded = false;
            if(s){
                while(copy > 0 && cg > 0 && n > 0){
                    isadded = true;
                    ans.add("green");
                    copy--;
                    cg--;
                    n--;
                }
            }
            else{
                while(copy > 0 && cb > 0 && n > 0){
                    ans.add("black");
                    isadded = true;
                    copy--;
                    cb--;
                    n--;
                }
            }
            if(!isadded){
                return new ArrayList<>();
            }
            s = !s;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solve(n,k,g,b));
        sc.close();
    }
}