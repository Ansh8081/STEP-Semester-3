package session2.classwork;
public class FileExtension{
    static String validateFileExtension(String filename){
        String extension=filename.substring(filename.lastIndexOf(".")+1);
        if(extension.equalsIgnoreCase("pdf")||extension.equalsIgnoreCase("docx")||extension.equalsIgnoreCase("zip"))
            return "Accepted";
        else
            return "Rejected - invalid file type";
    }
    public static void main(String[] args) {
        String filename="Assignment1.PDF";
        System.out.println(validateFileExtension(filename));
        String filename1="notes.txt";
        System.out.println(validateFileExtension(filename1));
    }
}