import java.util.*;

public class easy2 {
    public static String solve(String s){
        StringBuilder ans = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == prev){
                count++;
            }
            else{
                if(count > 1)
                    ans.append(count);
                
                count = 1;
                ans.append(prev);
                prev = curr;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solve(str));
        sc.close();
    }
}
