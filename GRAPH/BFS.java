// BFS - breadth first search
// code is in gfg style
import java.util.*;
public class BFS{
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int size=adj.size();
        boolean[] visited=new boolean[size];
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int src=0;
        q.add(src);
        visited[src]=true;
        // O(N) - time 
        while(!q.isEmpty()){
            int curr=q.poll();
            res.add(curr);
            // no of degree = 2 * Edges => 2E
            for(int i:adj.get(curr)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return res;
        // total complexity O(N) + 2E
    }

}
// Time - O(N + E)
// Space - O(N)
// using queue - visited arr - src