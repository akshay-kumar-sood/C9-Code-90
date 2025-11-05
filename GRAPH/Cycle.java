import java.util.*;

public class Cycle {
    class Pair{
    public Integer first;
    public Integer second;
    public Pair(Integer first,Integer second){
        this.first=first;
        this.second=second;
    }
    public Integer getfirst(){
        return first;
    }
    public Integer getsec(){
        return second;
    }
}
class Solution {
    public boolean detect(int src,List<List<Integer>> edges,boolean[] visited){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        visited[src]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int curr=p.getfirst();
            int parent=p.getsec();
            for(int i:edges.get(curr)){
                if(!visited[i]){
                    q.add(new Pair(i,curr));
                    visited[i]=true;
                }
                else if(i!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edgeList) {
         List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] edge : edgeList) {
            edges.get(edge[0]).add(edge[1]);
            edges.get(edge[1]).add(edge[0]);
        }
        boolean[] visited=new boolean[V];
        boolean flag=false;
        for(int i=0;i<V;i++){
            if(!visited[i]){
            flag=detect(i,edges,visited);
            if(flag==true){
                return true;
            }
        }}
        return false;
    }
}
}



// Approach : DFS use why? it spread 1 unit to its neighbour 
// 
//      2   3
//  1           6
//      4   5

//we maintain curr and parent
// curr,parent
// 1,-1     2,1     4,1     3,2     5,4     6,3     6,5
// visited array    1-T 2-T 4-T 3-T 5-T 6-T 6-T 
// wait 6 is visited 2 times.. glich found...but doesnot mean we got ans
// check it is source or parent
// eg.  1--2--3