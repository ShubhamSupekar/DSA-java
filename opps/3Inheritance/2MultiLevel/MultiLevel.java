//this is an example of Multiple level inheritance                               
class shape{                                                         //Base class
    String colour;                                                   //    |
    public void getColour(){                                         //    |    
        System.out.println(this.colour);                            //    TO
    }                                                               //     |
}                                                                 //       |
                                                                    //     |
class Trialnge extends shape{                                      //  Derived Class
    int b,h;                                                       //      |
    public void getValues(){                                       //      |
        System.out.println("base is:"+b+" height is:"+h);          //      |
    }                                                              //      TO
}                                                                  //      |
                                                                //         |
class Area extends Trialnge{                                       //  Derived Class
    public void area(){                                             
        System.out.println("area is:"+0.5*this.b*this.h);
    }
}

public class MultiLevel{
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.colour = "red";
        a1.b = 5;
        a1.h = 8;
        a1.area();
        a1.getColour();
        a1.getValues();
    }
}