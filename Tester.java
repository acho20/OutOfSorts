import java.util.Random;
import java.util.Arrays;

public class Tester{
  public static void main(String[]args){
    Random rand = new Random();
    int[] test = new int[Math.abs(rand.nextInt() % 100)];
    for (int i = 0; i < test.length; i++){
      test[i] = rand.nextInt();
    }
    int[] test2 = Arrays.copyOf(test, test.length);
    Sorts.insertionSort(test);
    Arrays.sort(test2);
    System.out.println(Arrays.toString(test));
    System.out.println(Arrays.equals(test, test2));
  }

}
