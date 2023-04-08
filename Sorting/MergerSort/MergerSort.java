
public class MergerSort
{
    public static void conqure(int arr[],int s,int mid,int l) {
        int merge[] = new int[l-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=l){
            if(arr[idx1]<=arr[idx2]){
                merge[x] = arr[idx1];
                x++; idx1++;
            }else{
                merge[x] = arr[idx2];
                x++;idx2++;
            }
        }
        while(idx1<=mid){
            merge[x] = arr[idx1];
            x++; idx1++;
        } 
        while(idx2<=l){
            merge[x] = arr[idx2];
            x++; idx2++;
        }
        for(int i=0,j=s;i<merge.length;i++,j++){
            arr[j] = merge[i];
        }
    }

	public static void divide(int arr[],int s,int l){
		if(s>=l){
			return;
		}
		int mid = s+(l-s)/2;
		divide(arr,s,mid);
		divide(arr,mid+1,l);
        conqure(arr,s,mid,l);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		int arr[] = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr,0,n-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
	}
}