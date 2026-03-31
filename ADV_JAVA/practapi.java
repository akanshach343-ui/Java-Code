//practice ques api mid level
import java.util.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
class Employee {
  int id;
  String name;
  double salary;
  int age;
  String department;

  public Employee(int id, String name, double salary, int age, String department) {
      this.id = id;
      this.name = name;
      this.salary = salary;
      this.age = age;
      this.department = department;
  }

  public int getId() { return id; }
  public String getName() { return name; }
  public double getSalary() { return salary; }
  public int getAge() { return age; }
  public String getDepartment() { return department; }
  public String toString(){
      return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' + ", salary=" + salary + ", age=" + age + ", department='" + department + '\'' + '}';
  }
}
class practapi{
//Sample ArrayList (used in questions)
    public static void main(String[] args){
    ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
      new Employee(101, "Amit", 50000, 25, "IT"),
      new Employee(102, "Neha", 60000, 28, "HR"),
      new Employee(103, "Ravi", 45000, 24, "IT"),
      new Employee(104, "Karan", 70000, 30, "Finance"),
      new Employee(105, "Pooja", 55000, 27, "HR"),
      new Employee(106, "Rohit", 80000, 32, "IT"),
      new Employee(107, "Simran", 65000, 29, "Finance"),
      new Employee(108, "Amit", 50000, 25, "IT")
));
        // Find employee with min salary
        Optional<Employee> result=empList.stream().min((a,b)->(int)a.getSalary()-(int)b.getSalary());
        result.ifPresent(System.out::println);

        //find max
        Optional<Employee> result2=empList.stream().min((a,b)->(int)b.getSalary()-(int)a.getSalary());
        result2.ifPresent(System.out::println);

        //find youngest employee
        Optional<Employee> result3=empList.stream().min((a,b)->a.getAge()-b.getAge());
        result3.ifPresent(System.out::println);

        //find oldest employee
        Optional<Employee> result4=empList.stream().min((a,b)->b.getAge()-a.getAge());
        result4.ifPresent(System.out::println);
        //find second highest salary
        Employee result5=empList.stream().sorted(    Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(result5);

        //find lowest
        Employee result6=empList.stream().sorted(    Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println(result6);

        //print top 3 highest salary employee
        List<Employee> result7=empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
        System.out.println(result7);

        //print lowest 3 salary employee
        List<Employee> result8=empList.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).toList();
        System.out.println("top 3 lowest salary:");
        System.out.println(result8);
        System.out.println("----------------");

        //remove duplicate employees based on name
        /*Set<String> seen = new HashSet<>();
        List<Employee> uniqueList = empList.stream()
            .filter(e -> seen.add(e.getName())) // add returns false if already present
            .collect(Collectors.toList());

        uniqueList.forEach(System.out::println);
can be done using groupingBy As well
        System.out.println(seen);*/
        empList.stream().collect(Collectors.toMap(Employee::getSalary, e->e,(e1, e2)->e1)).values().forEach(System.out::println);
        
        //remove duplicate employe based on salary: IMPPPPPPPPVERRRRYYYYYY
        System.out.println("----------------based on name--------------");
        empList.stream().collect(Collectors.toMap(Employee::getName, e->e,(e1, e2)->e1)).values().forEach(System.out::println);

        //find emp with min salry in it dept
        System.out.println();
        System.out.println("----------------q11-------------");
        Optional<Employee> result9=empList.stream().filter(e->e.getDepartment().equals("IT")).min((a,b)->(int)a.getSalary()-(int)b.getSalary());
        result9.ifPresent(System.out::println);
        //or use forEach(println) at end

        //find max salry in hr
        System.out.println();
        System.out.println("----------------q12-------------");
        Optional<Employee> result10=empList.stream().filter(e->e.getDepartment().equals("HR")).min((a,b)->(int)b.getSalary()-(int)a.getSalary());
        result10.ifPresent(System.out::println);

        //find min salry whose age is greater than 25
        System.out.println();
        System.out.println("----------------q13-------------");
        Optional<Employee> result11=empList.stream().filter(e->e.getAge()>25).min((a,b)->(int)a.getSalary()-(int)b.getSalary());
        result11.ifPresent(System.out::println);

        //find max salary whose age is less than 30
        System.out.println();
        System.out.println("----------------q14-------------");
        Optional<Employee> result12=empList.stream().filter(e->e.getAge()<30).min((a,b)->(int)b.getSalary()-(int)a.getSalary());
        result12.ifPresent(System.out::println);


        //print first 5 meploiyee using stream api
        System.out.println();
        System.out.println("----------------q15-------------");
        List<Employee> result13=empList.stream().limit(5).toList();
        System.out.println(result13);

        //skip first 3 and print remaining emplyees
        System.out.println();
        System.out.println("----------------q16-------------");
        List<Employee> result14=empList.stream().skip(3).toList();
        System.out.println(result14);

        //print top 2 youngest employees
        System.out.println();
        System.out.println("----------------q17-------------");
        List<Employee> result15=empList.stream().sorted(Comparator.comparing(Employee::getAge)).limit(2).toList();
        System.out.println(result15);

        //skip first 2 youngest employee and orint next 2 employee
        System.out.println();
        System.out.println("----------------q18-------------");
        List<Employee> result16=empList.stream().sorted(Comparator.comparing(Employee::getAge)).skip(2).limit(2).toList();
        System.out.println(result16);

        //print 3 top highest salary from it
        System.out.println();
        System.out.println("----------------q19-------------");
        List<Employee> result17=empList.stream().filter(e->e.getDepartment().equals("IT")).sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
        System.out.println(result17);

        //remove duplicate emp name and print first 5
        System.out.println();
        System.out.println("----------------q20-------------");
        empList.stream().collect(Collectors.toMap(Employee::getName, e->e,(e1, e2)->e1)).values().stream().limit(5).forEach(System.out::println);
        
        
    }
};

