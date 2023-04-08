
class Student{
    String name;
    int age;
    int rollNo;
    public void getInfo(){
        System.out.println("Name:"+this.name+" Age:"+this.age+" Roll No.:"+this.rollNo);  
    }
    Student(Student s3){                   //parameterized Constructor
        this.name = s3.name;
        this.age = s3.age;
        this.rollNo = s3.rollNo;
    }    
    Student(){

    }                                                                                
}
public class copy {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Shubham";
        s1.age = 21;
        s1.rollNo = 54;
        Student s2 = new Student(s1);
       s1.getInfo(); 
        s2.getInfo();   
    }
}
