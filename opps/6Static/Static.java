class Student{
    String Name;
    static String School;       //once you define school it will remain same for all the students
    public static void ChangeSchool(String d) {
        School = d;
    }
}

public class Static{
    public static void main(String[] args) {
        Student.School = "St. Lawarence";
        Student s1 = new Student();
        s1.Name  = "Shubham";
        Student s2 = new Student();
        s2.Name = "Soham";
        System.out.println(s1.Name+" school name is: "+s1.School);
        System.out.println(s2.Name+" school name is: "+s2.School);
        s1.ChangeSchool("ABC");
        System.out.println(s1.Name+" school name is: "+s1.School);
    }
}