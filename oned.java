/*import java.util.Scanner;
import java.util.Arrays;

public class oned{
    public static void main(String[] args){
        /*int[] [] arr= new int[3][2];
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
      System.out.println(Arrays.deepToString(arr));*/
      /*  System.out.println("enter the elements");
        Scanner sc = new Scanner(System.in);
        int[] arr2=new int[5];
        
        for(int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
    }
}*/

import java.util.Scanner;
import java.util.Arrays;

class oned{
    public static void main(String[] args){
        int[] [] a= new int[3] [2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j]=sc.nextInt(); 
            }

        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println(a[i]);
            }
        }
        System.out.println(Arrays.toString(a));

    }

}