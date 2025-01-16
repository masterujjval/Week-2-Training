import java.util.*;

public class Main{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle: ");
double rad=sc.nextDouble();
AreaofCircle obj=new AreaofCircle(rad);

obj.display();
System.out.println("\n");
}
}

public class AreaofCircle{

private double rad;

AreaofCircle(double rad){

this.rad=rad;

}

public void display(){
double ans=3.14*rad*rad;
System.out.printf("The radius of circle is: %.2f",ans);
}


}
