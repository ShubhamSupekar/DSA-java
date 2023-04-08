
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();
        
        int target=sc.nextInt();

        Accio ob = new Accio();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);
    
    }
}


class Accio {
    
  static int findElement(int arr[], int n,int target){
    // your code here
    int lo=0;
    int hi = n-1;
		int peak = FindPeak(arr);
    int idx = -1;
    idx = search(arr,lo,peak,target); //finding on right side.
    if(idx==-1) search(arr, peak, hi, target);
    return idx;
  }

  static int search(int[] arr,int lo,int hi,int target) {

    while(lo<=hi){
      int mid=(lo+hi)/2;
      if(arr[lo]==target){
        return lo;
      }else if(arr[hi]==target){
        return hi;
      }else if(arr[mid]==target){
        return mid;
      }
      if(arr[mid]>target){
        lo = mid+1;
      }else{
        hi = mid-1;
      }
    } 
    return -1;
  }

	static int FindPeak(int[] A){
		int lo=0;
		int hi = A.length-1;
    
    while (lo <= hi) {
      int mid = (lo + hi) / 2;

      if (mid - 1 < 0) {
          if (A[mid + 1] < A[mid]) {
              // I'm the peak
              return mid;
          } else {
              // I don't have a left side, so move right
              lo = mid + 1;
          }
      } else if (mid + 1 >= A.length) {
          if (A[mid - 1] < A[mid]) {
              // I'm the peak
              return mid;
          } else {
              // I don't have right side, so move left
              hi = mid - 1;
          }
      } else {
          // Am I the peak
          if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
              return mid;
          }
          // cheack wheather liying on inc path
          if (A[mid - 1] <= A[mid]) {
              // ans is towards right
              lo = mid + 1;
          }
          // if not on inc path
          else {
              // ans is towards left
              hi = mid - 1;
          }
        }
    }
    return -1;
	}
}