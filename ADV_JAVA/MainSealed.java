//how to stop inheriting a class?
//it will now only inherit these two classes
//3 rules either declare subclass as final or non sealed or sealed.
sealed class Shape permits Circle,Rectangle{
  
}
final class Circle extends Shape{
  
}
non-sealed class Rectangle extends Shape{
  
}
public class MainSealed{
  public static void main(String[] args){
    
  }
}
