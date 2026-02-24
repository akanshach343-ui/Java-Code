public class MainVar{
  public static void main(String[] args){
    int a=10;
    var b= 20;
    //after java10 we can use var keyword with some limits. it is called local variavle type inference
    var name="kiet mcac";
    var value=10.34;
    //var c;
    // c=20; first declaring then initialising isnot allowed for var.
    //instance variables cannot be declared with var keyword.

    String name2= new String("This is string");
    var name1= new String("this is string with var");

    int[] arr= new int[5];
    // var[] arr1= {1,2,3,4,5};

    String data="""
        This is multiline string
        This is second line
      kind of comments
      """;
   System.out.println(data);
  }
}
