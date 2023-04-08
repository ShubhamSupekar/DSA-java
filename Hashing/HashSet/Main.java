import java.util.HashSet;
import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set.contains(4));
        System.out.println(set.contains(2));
        set.remove(1);
        System.out.println(set.contains(1));
        System.out.println(set.size());
        System.out.println(set+" ");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}