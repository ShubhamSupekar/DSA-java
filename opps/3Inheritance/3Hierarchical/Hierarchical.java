//this is an example of Hierarchical inheritance                               
class shape{                                                                      //Base class
    String colour;                                                        //       /       \
    public void getColour(){                                       //  Derived Class       Derived class
        System.out.println(this.colour);                            
    }                                                               
}                                                                 
                                                                   
class Trialnge extends shape{                                      
    int b,h;                                                       
    public void getValues(){                                       
        System.out.println("base is:"+b+" height is:"+h);          
    }                                                               
}  

class Circle extends shape{
    int r;
    public void getValues(){                                       
        System.out.println("Redius is:"+r);          
    }
}                                 

class AreaOfCircle extends Circle{    
    public void Circumference(){
        System.out.println("Circumference of circle:"+2*3.14*this.r*this.r);
    }
}

class Area extends Trialnge{                                       
    public void area(){                                             
        System.out.println("area is:"+0.5*this.b*this.h);
    }
}

public class Hierarchical{
    public static void main(String[] args) {
        Area a1 = new Area();
        AreaOfCircle c1 = new AreaOfCircle();
        c1.colour = "blue";
        c1.r = 5;
        c1.getColour();
        c1.getValues();
        c1.Circumference();
        a1.colour = "red";
        a1.b = 5;
        a1.h = 8;
        a1.getColour();
        a1.getValues();
        a1.area();
    }
}