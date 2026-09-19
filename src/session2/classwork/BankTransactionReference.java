package session2.classwork;
public class BankTransactionReference{
    static String normalizeReference(String raw){
        String withoutspace=raw.trim();
        StringBuilder sb=new StringBuilder(withoutspace);
        return sb.substring(0, 3).toUpperCase().concat(withoutspace.substring(3)).toString();
    }
    static String validateAndFormat(String raw){
        int l=0,d=0;
        String normal=normalizeReference(raw);
        if(normal.length()!=14)
            return "Invalid: bank code must be 14 characters long";
        for(int i=0;i<3;i++)
            if(Character.isLetter((int)normal.charAt(i)))
                l++;
        if(l!=3)
            return "Invalid: bank code must be 3 letters at the start";
        for(int i=3;i<14;i++)
            if(Character.isDigit((int)normal.charAt(i)))
                d++;
        if(d!=11)
            return "Invalid: bank code must be 11 digits at the end";
        return "["+normal.substring(0,3)+"] DATE: "+normal.substring(3,5)+"/"+normal.substring(5,7)+"/"+normal.substring(7,9)+" | SEQ: "+normal.substring(9);
    }
    public static void main(String[] args) {
        String raw=" hdf03022600042 ";
        String raw1="12F03022600042";
        System.out.println(validateAndFormat(raw));
        System.out.println(validateAndFormat(raw1));
    }
}