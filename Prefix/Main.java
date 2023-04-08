import java.util.*;

class Solution {
        public int[] sumQuery(int[] arr, int[][] ranges) {
            // Your code here
            int[] ans = new int[ranges.length];
            int[] prefixArr = new int[arr.length];
            makePrefixArr(prefixArr,arr);

            for(int i=0;i<ranges.length;i++){
                int l= ranges[i][0];
                int r = ranges[i][1];
                if(l-1<0){
                    ans[i] = prefixArr[r];
                    continue;
                }
                ans[i] = prefixArr[r]-prefixArr[l-1];
            }
            return ans;
        }

        public static void makePrefixArr(int[] Prearr,int[] arr) {
            for(int i=0;i<arr.length;i++){
                if(i==0){
                    Prearr[i] = arr[i];
                    continue;
                }
                Prearr[i] = Prearr[i-1]+arr[i];
            }
        }
}

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[][] ranges = new int[m][2];
        for(int i = 0; i < m; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        Solution Obj = new Solution();
        int[] ans = Obj.sumQuery(arr, ranges);
        for(int i =0; i< ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
// I/P:
// 6
// -2 0 3 -5 2 -1
// 3
// 0 2 
// 2 5
// 0 5
// O/P:
// 1 -1 -3