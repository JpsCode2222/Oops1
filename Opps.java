class Pen{
String color;
String type;
void write(){
System.out.println("Pen is Writting");
}
void printColor_Type(){
System.out.println("Color of Pen: "+this.color);
System.out.println("Type of Pen: "+this.type);
System.out.println();
}
}

public class Opps{
public static void main(String args[]){
Pen Pen1 = new Pen();
Pen1.color="Red";
Pen1.type="Ball";

Pen Pen2 = new Pen();
Pen2.color="Blue";
Pen2.type="Gel";

Pen1.write();
Pen1.printColor_Type();

Pen2.write();
Pen2.printColor_Type();
}
}