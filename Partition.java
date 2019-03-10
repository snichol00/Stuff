public class Partition{}
  int partition ( int [] data, int start, int end){
    //choose random pivot
    Random r = new Random();
    int pIdx = r.nextInt(data.length);
    int pVal = data[pIdx];

    //swap pivot to be first int
    data[pIdx] = data[0];
    data[0] = pVal;

    //once start and end are equal, array has been partitioned
    while (start != end){
      if (data[start] < pivot){
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
  }
