abstract class Animal{      //we dont want to access Animal class for user because walk is define in next classes with walk function 
    abstract void walk();          //we create it but not access it
    // public void walk(){    //both are same we just dont want to use it here thats why we use abstract
                                //because each class contain its own walk function.
    // }
    public void eat(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("You are creating an animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        // Animal a1 = new Animal();       //after doing this you get an error "Animal is abstract; cannot be instantiated". and this 
        // a1.walk();                      //is a runtime error
        h1.eat(); //this is a non-Abstract method.      //This is an example of constructor chaining
        //first calls Base class Constructor(Animal()) and then Derived class constructor(Horse()).
    } 
}