class bubbleSort{
public static void main(String[] args) {
    int arr[] = {4,5,9,2,1,6};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp; 
            }
        }
    }   
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
}
}