import java.util.*;
class Pair{
    int node;
    int val;
    Pair(int node,int val){
        this.node=node;
        this.val=val;
    }
}
public class weight {
    public static void main(String[] args){
        List<ArrayList<Pair>> list=new ArrayList<>();
        int m=3;
        for(int i=0;i<m;i++){
            list.add(new ArrayList<Pair>());
        }

        //link 1-> 2 wieght 5
        list.get(1).add(new Pair(2,5));
        list.get(2).add(new Pair(1,5));
        
        // print
         for (int i = 1; i < m; i++) {
            System.out.print(i + " -> ");
            for (Pair p : list.get(i)) {
                System.out.print("(" + p.node + ", " + p.val + ") ");
            }
            System.out.println();
        }
    }
}
