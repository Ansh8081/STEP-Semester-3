package session11.assignment;
public class TheHeightLineUp {
    static void heightlineup(int[] heights){
        boolean swap;
        for(int k=0;k<heights.length;k++){
            swap=false;
            for(int i=0;i<heights.length-1;i++){
                if(heights[i]>heights[i+1]){
                    heights[i]=heights[i]+heights[i+1];
                    heights[i+1]=heights[i]-heights[i+1];
                    heights[i]=heights[i]-heights[i+1];
                    swap=true;
                }
            }
            System.out.print("Pass "+(k+1)+": [");
            for(int j=0;j<heights.length;j++){
                System.out.print(heights[j]+", ");
            }
            System.out.println("]");
            if(!swap)
                break;
        }
    }
    public static void main(String[] args) {
        int[] heights = {4, 2, 5, 1};
        heightlineup(heights);
        int[] height = {1, 3, 2, 4};
        heightlineup(height);
    }
}
