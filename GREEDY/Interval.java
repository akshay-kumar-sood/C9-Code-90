import java.util.*;
public class Interval {
    class Result {
  static int intervalScheduling(int[] start, int[] end) {
    ArrayList<int[]> list=new ArrayList<>();
       for(int i=0;i<start.length;i++){
          list.add(new int[]{start[i],end[i]});
       }
    Collections.sort(list,(a,b)->a[1]-b[1]);
    int cnt=1;
      int last=list.get(0)[1];
     // int cnt=0;
    for(int[] i:list){
        if(i[0]>=last){
            cnt++;
            last=i[1];
        }
    } 
      return cnt;
  }
}
}


// testpad