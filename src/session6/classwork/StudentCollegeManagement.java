package session6.classwork;
class Student{
    String name;
    double attendance;
    static String collegeName="SRM Institute of Science and Technology";
    static int studentCount=0;
    Student( String name,double attendance){
        this.name=name;
        this.attendance=attendance;
        studentCount++;
    }
    static void printCollegeInfo(){
        System.out.println(collegeName+"\nStudents created: "+studentCount);
    }
}
public class StudentCollegeManagement {
    public static void main(String[] args) {
        Student s1=new Student("Arya",78.9);
        Student s2=new Student("Sristi",80);
        Student.printCollegeInfo();
    }
}
