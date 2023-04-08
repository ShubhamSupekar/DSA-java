
public class Ifelse {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int max;
        if (a>b){
            max =a;
            System.out.println("Greater number is: "+max);
        }else{
            max = b;
            System.out.println("Greater number is: "+max);
        }    
        //same program is also written as 
        max = (a>b)?a:b;   //this is called as ternary operator
        System.out.println(max);
    }
}
