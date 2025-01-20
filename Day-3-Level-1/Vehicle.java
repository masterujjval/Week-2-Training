import java.util.*;

public class Main{
public static void main(String args[]){

// creating an object
Vehicle ob=new Vehicle("Ujjwal Gupta","4 wheeler",9034);

ob.display();


}

}


class Vehicle{

static int registrationFee=2500;
// final keyword

final int registrationNumber;
String ownerName, vehicleType;

// Constructor

Vehicle(String ownerName, String vehicleType, int registrationNumber){
this.ownerName=ownerName;
this.vehicleType=vehicleType;
this.registrationNumber=registrationNumber;
}


// Static method updateRegistrationFee() to modify the fee

public static void updateRegistrationFee(int fee){
Vehicle.registrationFee=fee; //modifying the value as it has static member 

}

public void display(){
System.out.println("The Owner name is: "+ownerName+"\nVehicle Type: "+vehicleType+"\nregistrationNumber: "+registrationNumber);
}

}


