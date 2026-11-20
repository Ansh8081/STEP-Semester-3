package session11.classwork;
public class WarehouseBinGridScan {
    static int x,y;
    static int warehouseSummary(int[][] grid){
        int total=0,max=0;;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                    x=i;
                    y=j;
                }
                total+=grid[i][j];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[][] grid = {{4, 9, 2},{7, 1, 6},{3, 12, 5}};
        System.out.printf("total = %d, maxCoordinate = (%d, %d)",warehouseSummary(grid),x,y);
    }
}
