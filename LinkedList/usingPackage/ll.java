import java.util.*;

class ll{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("is");
        list.addFirst("This");
        list.add("a");
        list.addLast("List");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
        // list.removeFirst();
        // System.out.println(list);
        // list.removeFirst();
        // System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}