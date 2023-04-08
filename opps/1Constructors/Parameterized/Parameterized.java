
class Student{
    String name;
    int age;
    int rollNo;
    public void getInfo(){
        System.out.println("Name:"+this.name+" Age:"+this.age+" Roll No.:"+this.rollNo);  
    }
    Student(String name,int age,int rollNo){                   //parameterized Constructor
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }                                                                                    
}
public class Parameterized {
    public static void main(String[] args){
        Student s1 = new Student("Shubham",21,54);
        Student s2 = new Student("Soham",18,24);  //new keyword allocates heap momory for the object s2
        s1.getInfo(); //first s1 calls getinfo method
        s2.getInfo();   //s2 calls getinfo method
    }
}
