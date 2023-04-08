
public class loops {
    public static void main(String[] args) {
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
        for(;i<6;i++){
            if (i<4){
                break;
            }
            i++;
            System.out.println(i);
        }
    }     
}
