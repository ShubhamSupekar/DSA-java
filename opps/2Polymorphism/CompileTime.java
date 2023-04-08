//this is an example of compile time polymorphism 
//also called as Method overloading.
class Student{
    String name;
    int age;
    int rollNo;
    Student(String name,int age,int rollNo){                  
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }          
    public void getInfo(String name,int age){          //this is known as polymorphism
        System.out.println("Name:"+this.name+" Age:"+this.age+" Roll No.:"+this.rollNo);     
    }       
    public void getInfo(String name){                 //same function name use multiple times in same class
        System.out.println(name);
    }                            
    public void getInfo(int age){
        System.out.println(age);  
    }                                       
}
public class CompileTime {
    public static void main(String[] args){
        Student s1 = new Student("Shubham",21,54);
        s1.getInfo(s1.name,s1.age); 
        s1.getInfo(s1.name);
        s1.getInfo(s1.age);
    }
}
