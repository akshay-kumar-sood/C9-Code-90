// Day2 - TestPad - basic DFS/BFS traversal - 3- November - 2025

import java.util.*;
public class Island {
    static void bfs(boolean[][] visited,int mat[][],int r,int c){
        int row=mat.length;
        int col=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        visited[r][c]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int lRow=curr[0];
            int lCol=curr[1];
            // paroshi
            for(int i=0;i<=3;i++){
                int newR=lRow+drow[i];
                int newC=lCol+dcol[i];
                if(newR>=0 && newC>=0 && newR<row && newC<col && !visited[newR][newC] && mat[newR][newC]==1){
                    visited[newR][newC]=true;
                    q.add(new int[]{newR,newC});
                }
            }
        }
    }
  static int countIslands(int mat[][], int r, int c){
      boolean[][] visited=new boolean[r][c];
      int cnt=0;
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              if(!visited[i][j] && mat[i][j]==1){
                  cnt++;
                  bfs(visited,mat,i,j);
              }
          }
      }
      return cnt;
  }   
}
