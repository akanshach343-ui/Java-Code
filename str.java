/*public class str{
  public static void main(String[] args){
    String s1="shruti";
    String s2="You are a good girl  ";
    String s3=new String("shruti");
    if(s1==s2){
      System.out.println("both are equal");
    }
    else{
      System.out.println("unequal");
    }
    System.out.println(s1.startsWith("s"));
    System.out.println(s1.endsWith("i"));
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s2);
    System.out.println(s2.trim());
    System.out.println(s2.substring(0,6));
    String [] s4=s2.split(" ");
    for(String s:s4){
      System.out.println(s);
    }

  System.out.println(s1.replace('s','y'));
    System.out.println(s1.length());
    System.out.println(s2.isEmpty());
    int a=10;
    String y="123";
    System.out.println(a+y);
    int b=Integer.parseInt(y);
    System.out.println(a+b);
    System.out.println(s1.charAt(3));
  }
  
} */

public class str{
  public static void main(String[] args){
    String s1="shruti";
    System.out.println(System.identityHashCode(s1));
    s1+="kumari";
    System.out.println(System.identityHashCode(s1));

    //to create mutable strings we use the stringbuilder class, thus after using hash code we get the same hash code
    StringBuilder s2=new StringBuilder("ram");
    System.out.println(System.identityHashCode(s2));
    s2.append("shyam");
    System.out.println(System.identityHashCode(s2));
    System.out.println(s2);
  }
}
//unit ends 