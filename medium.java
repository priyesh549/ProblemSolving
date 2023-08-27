import java.util.*;
public class medium {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val = arr[i][j];
                boolean check1 = true;
                boolean check2 = true;

                for(int c = 0; c < m ; c++ ){
                    if(arr[i][c] > val){
                        check1 = false;
                        break;
                    }
                }

                for(int r = 0; r < n ; r++ ){
                    if(arr[r][j] < val){
                        check2 = false;
                        break;
                    }
                }

                if(check1 && check2 ){
                    ans.add(val);
                }
            }
        }
        System.out.println(ans);
        scn.close();
    }
}
