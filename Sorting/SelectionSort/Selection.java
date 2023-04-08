class Selection{
    public static void main(String[] args) {
    int arr[] = {6,8,1,2,5,3,4};
    for(int i=0;i<arr.length;i++){
        int smallest = i;
        for(int j=i;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"");
    }
}
}