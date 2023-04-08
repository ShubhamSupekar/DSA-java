import java.util.*;

class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("US", 12);
        map.put("a", 222);
        map.put("b", 300);
        map.put("c", 800);
        map.put("d", 100);

        System.out.println(map);
        System.out.println(map.containsKey("US"));
        System.out.println(map.get("US"));
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey()+":");
            System.out.print(e.getValue()+", ");
        }

        Set<String> keys = map.keySet();
        System.out.println();
        for(String val:keys){
            System.out.print(val+" ");
        } 
        System.out.println();
        map.remove("US");
        System.out.println(map);
    }
}