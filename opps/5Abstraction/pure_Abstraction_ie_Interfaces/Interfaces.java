interface Animal{
    int eyes = 2;  //in interface if you are not defined access modifier this by default it is Public
    void walk();
}

interface Harbivore{
    void eat();
    String s = "green plants";
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on 2 legs and have "+eyes+" eyes");
    }
}

class Chicken implements Animal,Harbivore{
    public void eat(){
        System.out.println("eats "+s);
    }
    public void walk(){
        System.out.println("Walks on 2 legs and have "+eyes+" eyes");
    }
}

public class Interfaces{
    public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
       Chicken chicken = new Chicken();
       chicken.eat();
       chicken.walk(); 
    }
}