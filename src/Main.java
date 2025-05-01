import java.util.Arrays;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      List<Integer> input = Arrays.asList(1,23,45,7,5,36,7,8,2,4,4,6);
      List<Integer> evenNumbers = EvenNumberFilter.filterEvenNumbers(input);
        System.out.println("The original List: " + input);
        System.out.println("Even numbers: " + evenNumbers);

      List<Integer> input2 = Arrays.asList();
      List<Integer> evenNumbers2 = EvenNumberFilter.filterEvenNumbers(input2);
        System.out.println();
      System.out.println("The original List: " + input2);
      System.out.println("Even numbers: " + evenNumbers2);

        System.out.println();

      List<Integer> input3 = Arrays.asList(1,23,45,7,5,7,9,7);
      List<Integer> evenNumbers3 = EvenNumberFilter.filterEvenNumbers(input3);
        System.out.println("The original List: " + input3);
        System.out.println("Even numbers: " + evenNumbers3);


    }
}