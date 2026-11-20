package session11.classwork;
public class SpiralOrderTraversal {
    static void spiralOrder(int[][] grid){
        int[] first={0,0},second={0,grid[0].length-1},third={grid.length-1,0},fourth={grid.length-1,grid[0].length-1};
        while(third[1]!=fourth[1]){
            for(int i=first[1];i<=second[1];i++){
                System.out.print(grid[first[0]][i]+" ");
            }
            if(first[0]==second[0]&&first[1]==second[1]){break;}
            first[0]++;first[1]++;second[0]++;second[1]--;
            for(int i=second[0];i<=fourth[0];i++){
                System.out.print(grid[i][fourth[1]]+" ");
            }
            fourth[0]--;fourth[1]--;
            for(int i=fourth[1];i>=0;i--){
                System.out.print(grid[third[0]][i]+" ");
            }
            third[0]--;
            for(int i=third[0];i>=first[0];i--){
                System.out.print(grid[i][third[1]]+" ");
            }
        }
        third[1]++;
    }
    public static void main(String[] args) {
        int[][] grid={{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(grid);
    }
}
