interface Area{
  double pi=3.14;
  double getArea();
}

class circle implements Area{
  double r;
  circle(double r){
    this.r=r;
  }
  @Override
  public double getArea(){
    return pi*r*r;
  }

  public void displayArea(){
    System.out.println("Area of circle: "+ this.getArea());
  }
}

public class inter{
  public static void main(String[] args){
    circle c1=new circle(14.5);
    c1.displayArea();
    // System.out.println("Area of circle: "+ c1.getArea());

    Area c2= new circle(16.5);
    // c2.displayArea();
    System.out.println("Area of circle: " + c2.getArea());

    Area a1= new Area(){
      public double getArea(){
        int l=10; int b=8;
        return l*b;
      }
    };//shortcut for anonymous class and inheritance
    System.out.println("Area of rect= "+ a1.getArea());
  }
  //apne class ke construcotr se memeory allocate nhi hoti for interface i.e. instantiate ni hota but object can be created
    

  
}
