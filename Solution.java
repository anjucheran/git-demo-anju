import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scaneer sc = new Scanner(System.in);
        String[] list;
        list = (sc.nextLine()).split(" ");
        ArrayList<long> arrayList = new ArrayList<long>();
        for (String x : list){
            arrayList.add(Long.parseLong(x));
        }
        long max = 0;
        long min = 4000000000L;
        long sum1,sum2,sum3,sum4,sum5 = 0;
        for (int y=0 ; y<=4 ; y++){
            if (y!=0)
                sum1+=arrayList.get(y);
            if (y!=1)
                sum2+=arrayList.get(y);
            if (y!=2)
                sum3+=arrayList.get(y);
            if (y!=3)
                sum4+=arrayList.get(y);
            if (y!=4)
                sum5+=arrayList.get(y);
        }
        long[] newArray = {sum1,sum2,sum3,sum4,sum5};
        for (long z : newArray){
            if (z>=max)
                max = z;
            if (z<=min)
                min = z;
        }
        System.out.println(min+"  "+max);
    }
}