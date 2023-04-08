import java.util.*;

class main{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.empty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        Stack<Character> str = new Stack<>();
         String exp = "abcd";
         str.push(exp.charAt(0));
         System.out.println(str.peek());
    }
}