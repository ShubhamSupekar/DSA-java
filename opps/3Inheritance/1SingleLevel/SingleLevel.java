//this is an example of single level inheritance                               
class shape{                                                         //Base class
    String colour;                                                   //    |
    public void setColour(shape s1){                                 //    |    
        this.colour = s1.colour;                                     //    |
        System.out.println("Colour change to:"+this.colour);         //    TO
    }                                                               //     |
}                                                                 //       |
                                                                    //     |
class Trialnge extends shape{                                      //  Derived Class       
    public void getColour(){
        System.out.println(this.colour);
    }
}

public class SingleLevel{
    public static void main(String[] args) {
        Trialnge t1 = new Trialnge();
        Trialnge t2 = new Trialnge();
        //t1.getColour();
        t1.colour = "red";
        t1.getColour();
        t2.colour = "blue";
        t2.getColour();
        t2.setColour(t1);
        t1.getColour();
        t2.getColour();
    }
}