import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class Employee{
  int eid;
  String name;
  String department;
  public Employee(int eid, String name, String department){
    this.eid=eid;
    this.name=name;
    this.department=department;
  }
}

class MapEx{
  public static void main(String[] args){
    List<Integer> numbers= Arrays.asList(23,32,45,35,67,89,95);
    System.out.println(numbers);
    //  <double> can be used to specify return type
    //map is used to perform operations on each element of stream like for each loop
    List<Integer> result= numbers.stream().map(n->n+5).toList();
    System.out.println(result);
    //to return values less than 40
    List<Integer> res= numbers.stream().filter(n->n<40).map(n->n+5).toList();
    System.out.println(res);

    System.out.println("questions");
    //given arraylist["sachin", "rahul", "amit"] convert all to uppercase using ,ap().
    ArrayList<String> list= new ArrayList<>();
    list.addAll(Arrays.asList("sachin", "rahul", "amit"));
    List<String> res2=list.stream().map(s->s.toUpperCase()).toList();
    //the above list result deduced by toList() is immutable . thus we must use then.collect(Collectors.toList()) to manipulate it further.
    System.out.println(res2);
    
    //ques2. create sq of 1 2 3 4

    //ques3. in string, "java, python, 'c' extract first character of each string
    
    //ques 4. 10, 20, 30 convert all int to string

    ArrayList<Integer> list2= new ArrayList<>();
    list2.addAll(Arrays.asList(10,20,30));
    List<String> res3= list2.stream().map(n->n.toString()).toList();
    System.out.println(res3);

    //ques5. A, B, C is string add prefix "item" to each element
    ArrayList<String> list3= new ArrayList<>();
    list3.addAll(Arrays.asList("A", "B", "C"));
    List<String> res4= list3.stream().map(s->"item"+s).toList();
    System.out.println(res4);

    //ques6. "Java, "Stream", "API", convert string to its length
    ArrayList<String> list4= new ArrayList<>();
    list4.addAll(Arrays.asList("Java", "Stream", "API"));
    List<Integer> res5=list4.stream().map(name->name.length()).toList();
    System.out.println(res5);

    //ques 7. arraylist<employee> where employees are [("Ankit"), ("Ravi")] extract only employee names.
    //written outside main function
    // class Employee{
    //   int eid;
    //   String name;
    //   String department;
    //   public EMployee(int eid, String name, String department){
    //     this.eid=eid;
    //     this.name=name;
    //     this.department=department;
    //   }
    // }
    ArrayList<Employee> list5= new ArrayList<Employee>();
    list5.add(new Employee(1, "Ankit", "IT"));
    list5.add(new Employee(2, "Ravi", "HR"));
    List<String> empNames=list5.stream().map(emp->emp.name).toList();
    System.out.println(empNames);
    
    //ques8. given an arraylist<integer> [5,10,15],double each value.
    ArrayList<Integer>list6=new ArrayList<>();
    //list6.addAll()

    //ques11. arraylist<double> [0.0., 20.0, 30.0] convert celsius to fahrenheit
    
  }
}
