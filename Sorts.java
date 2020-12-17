import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int placeholder = 0;
    for(int i = 0; i < data.length -1 ; i++){
      for(int j = 0; j < data.length - 1 - i; j++){
        if(data[j] > data[j + 1]){
          placeholder = data[j];
          data[j] = data[j+1];
          data[j + 1] = placeholder;
        }
      }
    }
  }
  public static void selectionSort(int[] data){
    int index = 0;
    int smallest = 0;
    int valueholder = 0;
    for(int i = 0; i < data.length; i++){
      index = i;
      smallest = data[i];
      for(int j = i; j < data.length; j++){
        if(data[j] < smallest){
          index = j;
          smallest = data[j];
        }
      }
      valueholder = data[i];
      data[i] = smallest;
      data[index] = valueholder;
    }
  }

}
