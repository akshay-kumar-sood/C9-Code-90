import java.util.*;
public class basic {
    public static void main(String[] args){
        List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int n=3,m=3;
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<Integer>());
        }

        // link between 1->2
        list.get(1).add(2);
        list.get(2).add(1);

        // link 2 -> 3
        list.get(2).add(3);
        list.get(3).add(2);
        
        //print
        for(int i=1;i<=m;i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(i+" -> "+ list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
