// gfg style - day 2 - 3|Nov|2025 - easy traversal

import java.util.*;
public class Flood {
     public void bfs(boolean[][] visited,int[][] image,int r,int c,int newColor,int prev){
       int row=image.length;
       int col=image[0].length;
       
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        visited[r][c]=true;
        image[r][c]=newColor;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int newR=curr[0];
            int newC=curr[1];
            for(int i=0;i<=3;i++){
                int Lrow=newR+drow[i];
                int Lcol=newC+dcol[i];
                if(Lrow>=0 && Lrow<row && Lcol>=0 && Lcol<col && !visited[Lrow][Lcol] && image[Lrow][Lcol]==prev){
                    image[Lrow][Lcol]=newColor;
                    visited[Lrow][Lcol]=true;
                    q.add(new int[]{Lrow,Lcol});
                }
            }
            
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int r=image.length;
        int c=image[0].length;
        boolean[][] visited=new boolean[r][c];
        bfs(visited,image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
}
