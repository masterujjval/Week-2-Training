import java.util.*;


public class Main{

public static void main(String args[]){

// calling using object

Circle ob=new Circle();
ob.calculateArea();

Circle ob2=new Circle(79.89);
ob2.calculateArea();


}

}

class Circle{

private double radius;

Circle(){
this(3.69);
}
Circle(double radius){
this.radius=radius;

}

 public void calculateArea() {
        System.out.println("The radius is: "+ (Math.PI * radius * radius));
    }

}


