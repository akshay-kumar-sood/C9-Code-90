import java.util.ArrayList;

public class Provience {
    class Solution {
    static void dfs(int curr,boolean[] visited,ArrayList<ArrayList<Integer>> adj2){
        visited[curr]=true;
        for(int i:adj2.get(curr)){
            if(!visited[i]){
                dfs(i,visited,adj2);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj2.add(new ArrayList<Integer>());
        }
        int n=adj.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adj2.get(i).add(j);
                    adj2.get(j).add(i);
                }
            }
        }
        boolean[] visited=new boolean[n];
        int cnt=0;
        for(int i=1;i<n;i++){
            if(!visited[i]){
                cnt++;
                dfs(i,visited,adj2);
            }
        }
        return cnt;
    }
};
}
