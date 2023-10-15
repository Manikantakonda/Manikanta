package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Shuffle_an_array {
   public static void main(String[] args) {
      String str[] = {"1", "2", "3", "4", "5","6","7"};
      List<String>list = Arrays.asList(str);
      Collections.shuffle(list);
      System.out.println("Shuffled the array using List = "+list.toString());
   }
}