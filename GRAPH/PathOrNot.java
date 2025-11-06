import java.util.*;
public class PathOrNot {
class Main{
    public static boolean dfs(ArrayList<ArrayList<Integer>> list,int src,int des,boolean[] visited,LinkedList<Integer> q){
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==des){return true;}
            for(int i:list.get(curr)){
                if(!visited[i]){
                   visited[i]=true;
                    q.add(i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int ele=sc.nextInt();
            int ele2=sc.nextInt();
            list.get(ele).add(ele2);
        }
        int src=sc.nextInt();
        int des=sc.nextInt();
        if(src==des){
            System.out.print("YES");
            return;
        }
        boolean[] visited=new boolean[v];
        LinkedList<Integer> q=new LinkedList<>();
        q.add(src);
        visited[src]=true;
        boolean flag=false;
        for(int i=0;i<v;i++){
            if(!visited[i]){
               flag=dfs(list,src,des,visited,q);
               if(flag==true){System.out.print("YES");return;}
            }
        }
        System.out.print("NO");
    }
}
}


// testpad question simple dfs