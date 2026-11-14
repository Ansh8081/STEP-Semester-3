package session11.assignment;
public class ThePrizeTable {
    static int swap;
    static int[] highestswap(int[] marks){
        int highest,index;
        for(int i=0;i<marks.length;i++){
            highest=marks[i];
            index=i;
            for(int j=i+1;j<marks.length;j++){
                if(marks[j]>highest){
                    highest=marks[j];
                    index=j;
                }
            }
            if(index!=i){
                marks[i]+=marks[index];
                marks[index]=marks[i]-marks[index];
                marks[i]-=marks[index];
                swap++;
            }
        }
        return marks;
    }
    public static void main(String[] args) {
        int[] marks = {45, 90, 60, 75};
        int[] mark = {80, 70, 60};
        int[] sorted=highestswap(marks);
        System.out.print("[");
        for(int a:sorted){System.out.print(a+", ");}
        System.out.println("] swaps = "+swap);
        swap=0;
        sorted=highestswap(mark);
        System.out.print("[");
        for(int a:sorted){System.out.print(a+", ");}
        System.out.println("] swaps = "+swap);
    }
}