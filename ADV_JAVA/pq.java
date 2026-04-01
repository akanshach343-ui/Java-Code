import java.util.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
class pq {
   public static void main(String[] args){
     //find sum of 3 largest no
     List<Integer> list=Arrays.asList(15,22,8,40,12,35,50,5);
     int sum=list.stream().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).sum();
     System.out.println(sum);

     //second smallest num:25,10,5,30,15,20
     List<Integer> list2=Arrays.asList(25,10,5,30,15,20);
     int sec=list2.stream().sorted().skip(1).findFirst().get();
     System.out.println(sec);

     //largest even no: 18,21, 33, 44,55,60, 17
     List<Integer> list3=Arrays.asList(18,21, 33, 44,55,60, 17);
     int lar=list3.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).findFirst().get();
     System.out.println(lar);

     //remove first 2 largest value and print remaining
     List<Integer> list4=Arrays.asList(10,20,30,40,50,60,70);
     List<Integer> rem=list4.stream().sorted(Comparator.reverseOrder()).skip(2).toList();
     System.out.println(rem);

     //multiply every number by 3 and find min 
     List<Integer> list5= Arrays.asList(5,8,12,3,9);
     int min=list5.stream().map(n->n*3).min((a,b)->a-b).get();
     System.out.println(min);

     //find sum of num betwene 10 and 40. 
     List<Integer> list6= Arrays.asList(5,15,25,35,45,20,10);
     int su= list6.stream().filter(n->n>10 && n<40).reduce(0,(a,b)->a+b);
     System.out.println(su);

     //print 3rd largest

     //convert into sq and print top 4 values
     List<Integer> list7= Arrays.asList(3,5,7,28,6,4);
     List<Integer> ll=list7.stream().map(n->n*n).sorted(Comparator.reverseOrder()).limit(4).toList();
     System.out.println(ll);

     //find sum of smallest 4numb
     List<Integer> list8=Arrays.asList(10,20,30,40,50,60);
     int sum2=list8.stream().sorted().limit(4).reduce(0, (a,b)->a+b);
     System.out.println(sum2);

     //find largest no after skipping first 3 smallest no
     List<Integer> list9 = Arrays.asList(10,5,40,30,25,15,50);
     int lar2=list9.stream().sorted(Comparator.reverseOrder()).limit(list9.size()-3).min((a,b)->a-b).get();
     System.out.println(lar2);

     //find smallest odd num greater than 20
     List<Integer> lis9 = Arrays.asList(12,25,31, 18,41,7,22);
     int sm=lis9.stream().filter(n->n%2!=0 && n>20).min((a,b)->a-b).get();
     System.out.println(sm);

     //find prod of all num greater than 5
     List<Integer> lis2 = Arrays.asList(2,6,3,8,4,10);
     int pr= lis2.stream().filter(n->n>5).reduce(1,(a,b)->a*b);
     System.out.println(pr);

     //max sq of odd numbers
     List<Integer> lis3= Arrays.asList(3,8,11,6,5,9,4);
     int od=lis3.stream().filter(n->n%2!=0).map(n->n*n).min((a,b)->b-a).get();
     System.out.println(od);
     System.out.println("hello");

     //top 3 even no sum
     List<Integer> lis4= Arrays.asList(10,15,22,30,17,42, 8);
     int s= lis4.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).limit(3).reduce(0,(a,b)->a+b);

     
     
     
     

     //shift lang,flutter, react
     
   } 
}
