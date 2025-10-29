import java.util.Scanner;
import java.util.Arrays;

public class oned{
    public static void main(String[] args){

        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int [] a={1, 2, 3};
        System.out.println(Arrays.toString(a));
    }
}