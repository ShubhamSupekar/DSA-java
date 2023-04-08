import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(MaxSumSubarray(arr));
    }

    public static int MaxSumSubarray(int[] arr) { //time complexity is O(n)
        int maxsum = Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum = currsum+arr[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}