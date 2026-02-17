//functional interface is a interface that have only 1 abstract method nad is declared with annotation @functionalInterface default,static,private can be multiple
//annotation is the extra information provided to the compiler
//we declare it to shorten the code for survival.

@FunctionalInterface
interface Add{
  int calculate(int n1, int n2);
}
public class funct_interfc {
   public static void main(String[] args){
     Add a=new Add(){
       @Override
       public int calculate(int n1, int n2){
         return n1+n2;
       }
     };
     System.out.println("Sum is: "+ a.calculate(23,34));
     Add a1=(int n1, int n2)->(n1+n2);//lambda expression, in js arrow function
     System.out.println("Sum : " +a1.calculate(23,34));
   } 
}

//lamda expresion is short form of declaring anonymous function, that that reference is pass to the functional interface object.
//conditions: that interface must have only 1 method and should have same signature as the method of interface.

/*types of writing lamba expressions.
1.No parameter, no return type
a.()->{} when multiple lines of code
b.()->System.out.println("Lambda expression") //single line of code
2.No parameter, with return type
a. ()->{
    //write code here (multiple lines of code)
    return 10;
    }
b.  ()->10; //single line of code, it will automatically return with return keyword. and if we write return keyword then it is compulsory to write curly braces.
3.With parameter, no return type
a.With one parameter
  (int num1)-> System.out.println(num1); //single line of code
  (num1)-> System.out.println(num1); //single line of code
  num1-> System.out.println(num1); //single line of code
  num1->{
  Syso("multiple line");
  syso(num1);
  }
  //single parameter can be written without parenthesis and without data type
b. 
4.With parameter, with return type
a. (int num1, int num2) -> num1+num2;
(int num1, int num2)-> (return num1+num2)
here we have to write  return keyword and curly braces for multiple lines of code and have to specify data type of parameter and parenthesis.
  */
