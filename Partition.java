import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Partition{
  public static int partition(int [] data, int start, int end){
    //choose random pivot
    Random r = new Random();
    int pIdx = r.nextInt(data.length);
    int pVal = data[pIdx];

    //swap pivot to be first int
    data[pIdx] = data[start];
    data[start] = pVal;
    //System.out.println(Arrays.toString(data));
    //once start and end are equal, array has been partitioned
    while (start != end){
      if (data[start] > pVal){
        //swap start and end
        int temp = data[start];
        data[start] = data[end];
        data[end] = temp;
        end--;
      }
      else{
        start++;
      }
    }
    //System.out.println("loop finished");
    //System.out.println(Arrays.toString(data));
    //once sorted, you need to switch the pivot back into place
    if (data[start] > pVal){
      data[0] = data[start - 1];
      data[start - 1] = pVal;
      return start - 1;
    }
    else{
      data[0] = data[start];
      data[start] = pVal;
      return start;
    }
  }

  public static void main(String[] args) {
    int[] data = {1,7,4,2,3,6,5,4,2,7,5};
    //for (int i=0;i<10;i++) {
      partition(data,0,10);

    //}
  }

}
