import java.util.Map;
import java.util.HashMap; 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr1 = findSum();
    if(arr1!=null)
      for(int item: arr1)
          System.out.println(item+" ");
  }

  public static int[] findSum(){
    int[] arr= {1,2,3,4};
    Map<Integer,Integer> map = new HashMap<>();
   int sum = 5;
   int comp;
    for(int i=0;i<arr.length;i++){
      comp = sum-arr[i];
      if(map.containsKey(comp))
          return new int[]{comp,arr[i]};
      map.put(arr[i], i);
    }
    return null;

    
  }
}