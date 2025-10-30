import java.util.Scanner;
import java.util.Arrays;

public class oned{
    public static void main(String[] args){
        int[] [] arr= new int[3][2];
        System.out.println("enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
              arr[i][j]=sc.nextInt();            }
        }
      System.out.println("the elements are");
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[i].length; j++){      System.out.println(arr[i][j]);
            }
        System.out.println();
      }
      System.out.println(Arrays.deepToString(arr));
    }
}