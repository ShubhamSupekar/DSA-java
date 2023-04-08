public class arr {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.print("[");
        for(int x: arr){            //this is another way to print an array
            System.out.print(" ");
            System.out.print(x);
        }     
        System.out.print(" ]");
        System.out.println("");
        System.out.println(arr.length);
    }    

}
