
class Student{
    String name;
    int age;
    int rollNo;
    public void getInfo(){
        System.out.println("Name:"+this.name+" Age:"+this.age+" Roll No.:"+this.rollNo); //this is a keyword in java to know which 
    }                                                                                    // object calls the method.
}
public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.getInfo();
        s1.name = "Shubham";
        s1.age = 21;
        s1.rollNo = 54;
        Student s2 = new Student();  //new keyword allocates heap memory for the object s2
        s2.name = "Soham";
        s2.rollNo = 21;
        s2.age = 18;
        s1.getInfo(); //first s1 calls getinfo method
        s2.getInfo();   //s2 calls getinfo method
    }
}
