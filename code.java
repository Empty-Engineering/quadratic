

public class Main{

    public static void main(String args[]){
    
double a = 3;

double b = -6;
double c = -24;
double aos = ((-b)/(2*a));
double vertex = (a*(aos*aos)+(b*aos)+c);
double x1 = (-b + Math.sqrt(b*b + (-4)*a*c))/(2*a);
double x2 = (-b - Math.sqrt(b*b + (-4)*a*c))/(2*a);


if (a != 0) {
System.out.print("x-value 1: ");
System.out.print( x1);
System.out.print(", x-value 2: ");
System.out.print(x2);
System.out.print(", Axis of Symmetry: ");
System.out.print(aos);
System.out.print(", y-intercept: ");
System.out.print(c);
System.out.print(", Vertex: (");
System.out.print(aos);
System.out.print(", ");
System.out.print(vertex);
System.out.print(")");
           
		   }
		   else{
		   	System.out.print("Error");
		   }
       }
  } 
