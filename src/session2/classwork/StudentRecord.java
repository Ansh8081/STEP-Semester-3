package session2.classwork;
public class StudentRecord{
    static void parseStudentRecord(String csvLine){
        String studentinfo[]=csvLine.split(",");
        if(studentinfo.length!=3){
            System.out.println("Invalid Record");
        }
        else{
            System.out.println("Name: "+studentinfo[0]+" | Roll No: "+studentinfo[1]+" | Dept: "+studentinfo[2]);
        }
    }
    public static void main(String[] args) {
        String csvLine="Ananya Verma,RA2211003010123,CSE";
        parseStudentRecord(csvLine);
        String csvLine2="Ananya Verma,CSE";
        parseStudentRecord(csvLine2);
    }
}