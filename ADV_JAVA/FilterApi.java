import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterApi{
  public static void main(String[] args){
    //always use class object instead of interface coz some methods are not implemented in interface
    ArrayList<Integer> list= new ArrayList<>();
    list.add(23);
    list.add(45);
    list.addAll(List.of(11, 24, 87, 40, 35));
    System.out.println(list);
    Stream ListStream=list.stream();//can create reference variable like liststream or even without it.
    //ListStream.forEach((elem)->System.out.print(elem + " "));
    ListStream.forEach(System.out::println);
    //hence stream can only be used once to perform operations. 
    //the above line andbelow line gives same outpit coz new object h
    System.out.println("using stream again");
    
    // list.stream().forEach(System.out::println);

    //new
    // ArrayList<String> students= new ArrayList<>();
    // students.add("Ram");
    // students.add("Sir");
    // students.add("bro");
    // students.addAll(List.of("pro", "noob"));
    // System.out.println(students);

    // students.stream().forEach((el)->System.out.println(el));

    System.out.println("Count="+list.stream().count());//most optimal running from indexing, hashing.eg:amazon needs count of no of customers placed order after every 10 mins. similarly for clients.
    //supoose above data is marks
    System.out.println("Count="+ list.stream().filter((el)->el>60).count());
    //using phle check and then print without if else
    list.stream().filter(n->n>30).forEach((element)->System.out.println(element));
    
    
    
  }
}
