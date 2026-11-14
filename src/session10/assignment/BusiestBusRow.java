package session10.assignment;
public class BusiestBusRow {
    static int[] busiestRow(int[][] grid){
        int[] large={0,0};
        for(int i=0;i<grid.length;i++){
            int total=0;
            for(int j=0;j<grid[i].length;j++){
                total+=grid[i][j];
            }
            if(total>large[1]){
                large[1]=total;
                large[0]=i;
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[][] grid={{2,0,1},{3,3,1},{1,1,1}};
        int[] a=busiestRow(grid);
        System.out.println("Row "+a[0]+", Total "+a[1]);
    }
}
