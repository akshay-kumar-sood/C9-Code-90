import java.util.*;
public class Job {
    class Result {
  static int jobScheduling(int[] deadlines, int[] profits) {
    ArrayList<int[]> list=new ArrayList<>();
      for(int i=0;i<deadlines.length;i++){
          list.add(new int[]{deadlines[i],profits[i]});
      }
      Collections.sort(list,(a,b)->b[1]-a[1]);
      int max=0;
      for(int i:deadlines){
          max=Math.max(max,i);
      }
      int res=0;
     boolean[] visited=new boolean[max+1];
     for(int[] i:list){
         for(int j=i[0];j>=1;j--){
             if(!visited[j]){res+=i[1];visited[j]=true;break;}
         }
     }
      return res;
  }
}
}


//testpad