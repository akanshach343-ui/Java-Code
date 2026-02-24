//record is a class that is immutable and final. it is used to store data. it is used to create immutable objects. it is used to create immutable objects.used while creating DTO(Data Transfer Object) during api calling.

//a class which is declared with record keyword instead of class keyword is called record class. we pass the constructor with the record class name and the parameters that we want to store in the record class.
import java.util.*;
import java.util.function.Consumer; //consumer is a functional interface that takes one argument and returns nothing.has accept method.
record Student(int sid, String name, String course){
  
};

public class MainRecord{
  public static void main(String[] args){
    Student s1= new Student(1,"Rahul","Java");
    System.out.println(s1.sid());
    System.out.println(s1.name());
    System.out.println(s1.course());
    System.out.println(s1);
//for each method(under collections)
    int data[]= new int[] {1,2,3,4,5};
    List<int[]> listdata= new ArrayList<>(Arrays.asList(data));
    System.out.println(listdata.get(0)[0]);

    //converting using stream(optimised way)
    List<Integer> listdata1= Arrays.stream(data).boxed().toList();
    System.out.println(listdata1);

    //using for each method........ques.what does for each method do? it is a method of iterable interface. it takes a consumer object as an argument. it is used to iterate over the elements of the collection. it is used to iterate over the elements of the collection. 
    listdata1.forEach((value)->System.out.println(value));
    
    
  }
}
