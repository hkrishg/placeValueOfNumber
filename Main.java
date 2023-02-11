import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    int num = 439;
    List<Integer> list = new ArrayList<>();
    int rem = 1,p = 1, x=0;
    while(num != 0){
      rem = num % 10;
      p = (int)Math.pow(10,x);
      x++;
      list.add(p * rem);
      num = num / 10; 
    }
    List<Integer> revList = new ArrayList<>();

  for (int i = list.size() - 1; i >= 0; i--){
    revList.add(list.get(i));
  }
    System.out.println(revList);
  }
}