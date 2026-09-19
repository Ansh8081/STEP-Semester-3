package session2.classwork;
public class MaskedPhoneNumber{
    static boolean isnum(String phone){
        int num=0;
        if(phone.charAt(0)=='0'||phone.length()!=10){
            return false;
        }
        for(int i=0;i<10;i++)
            for(int j=48;j<58;j++)
                if((int)phone.charAt(i)==j)
                    num++;
        if(num==10)
            return true;
        else
            return false;

    }
    static String maskPhoneNumber(String phone){
        if(isnum(phone)){
            StringBuilder sb=new StringBuilder(phone);
            phone=sb.delete(0,6).insert(0,"XXXXXX-").toString();
            return phone;
        }
        return "Invalid phone number";
    }
    public static void main(String[] args) {
        String phone="9876543210";
        String phone2="98765";
        System.out.println(maskPhoneNumber(phone));
        System.out.println(maskPhoneNumber(phone2));
    }
}