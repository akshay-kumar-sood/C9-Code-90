import java.util.ArrayList;

public class DFS {
    class Solution {
    public void dfs(int curr,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> res){
        res.add(curr);
        visited[curr]=true;
        for(int i:adj.get(curr)){
            if(!visited[i]){
                dfs(i,adj,visited,res);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int size=adj.size();
        int src=0;
        boolean[] visited=new boolean[size];
        ArrayList<Integer> res=new ArrayList<>();
        dfs(0,adj,visited,res);
        return res;
    }
}

// time - O(N) + 2E 
// space O(N) + O(N) + O(N) = O(n).
// res visited recursion stack space worst case skewed graph 
}
