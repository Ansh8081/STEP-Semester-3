package session10.assignment;
public class DutyRosterRotation {
    static char[] rotateRoster(char[] names,int k){
        char[] rotated=new char[names.length];
        for(int i=0;i<names.length;i++){
            rotated[(k+i)%names.length]=names[i];
        }
        return rotated;
    }
    public static void main(String[] args) {
        char[] names = {'A', 'B', 'C', 'D', 'E'};
        int k=2;
        char[] rotated=rotateRoster(names, k);
        System.out.print("[ ");
        for(char c:rotated)
            System.out.print(c+", ");
        System.out.println("]");
        k=7;
        rotated=rotateRoster(names, k);
        System.out.print("[ ");
        for(char c:rotated)
            System.out.print(c+", ");
        System.out.println("]");
    }
}
