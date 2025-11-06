 // MULTI SOURCE BFS
// similar to rotten tomatoes
// start thinkinf from 0 instead of 1.

import java.util.LinkedList;
public class ZeroOneMatrix {
class Pair{
    Integer first;
    Integer second;
    Integer third;
    public Pair(Integer first,Integer second,Integer third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public int getfirst(){
        return first;
    }
    public int getsec(){
        return second;
    }
    public int getthird(){
        return third;
    }
}

class Solution {
    public void bfs(int[][] mat,boolean[][] visited,int[][] res,LinkedList<Pair> q,int d){
        int rowsize=mat.length;
        int colsize=mat[0].length;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        
       
        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.getfirst();
            int col=p.getsec();
            int dis=p.getthird();
            for(int i=0;i<=3;i++){
                int newR=row+drow[i];
                int newC=col+dcol[i];
                if(newR>=0 && newR<rowsize && newC>=0 && newC<colsize && !visited[newR][newC]){
                    if(mat[newR][newC]==0 ){
                        res[newR][newC]=0;
                        visited[newR][newC]=true;
                        q.add(new Pair(newR,newC,0));
                    }
                    else if(mat[newR][newC]==1){
                        q.add(new Pair(newR,newC,dis+1));
                        res[newR][newC]=dis+1;
                        visited[newR][newC]=true;
                    }
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] res=new int[r][c];
        boolean[][] visited=new boolean[r][c];
        LinkedList<Pair> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                    System.out.print('h');
                }
            }
        }
        bfs(mat,visited,res,q,0);
        return res;
    }
}
}
