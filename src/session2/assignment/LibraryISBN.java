package session2.assignment;
public class LibraryISBN{
    static String normalizeCode(String raw){
        String withoutspace=raw.trim();
        StringBuilder sb=new StringBuilder(withoutspace);
        return sb.substring(0,3).toUpperCase().concat(withoutspace.substring(3)).toString();
    }
    static String validateAndFormat(String raw){
        int l=0,d=0;
        String code=normalizeCode(raw);
        if(code.length()!=13)
            return "Invalid Code: Code must be 13 character long";
        for(int i=0;i<code.length();i++){
            if(i<3&&Character.isLetter(code.charAt(i)))
                l++;
            if(i>=3&&Character.isDigit(code.charAt(i)))
                d++;
        }
        if(l!=3)
            return "Invalid Code: Code must have 3 letters at start";
        if(d!=10)
            return "Invalid Code: Code must have 10 digits at end";
        return "["+code.substring(0,3)+"] YEAR: "+code.substring(3,7)+" | CATALOG: "+code.substring(7);
    }
    public static void main(String[] args) {
        String code=" pen2026004251 ";
        String code2="12N2026004251";
        System.out.println(validateAndFormat(code));
        System.out.println(validateAndFormat(code2));
    }
}