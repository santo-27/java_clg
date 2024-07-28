

// import Calculator.*;
import java.util.Scanner;

public class Main{

public static void main(String[] args){
Calculator calc = new Calculator();
Scanner scanner = new Scanner(System.in);

while(true){
float a = 0;
float b = 0;
System.out.println("Enter the nums and the operation, enter n to break");
String wish = scanner.next();
if(wish.equals("n")){
break;
}
a = scanner.nextFloat();
b = scanner.nextFloat();

switch(wish){
case "+":
System.out.println(calc.add(a,b));
break;

case "-":
System.out.println(calc.sub(a,b));
break;

case "*":
System.out.println(calc.mul(a,b));
break;

case "/":
System.out.println(calc.div(a,b));
break;

case "%":
System.out.println(calc.mod(a,b));
break;

default:
System.out.println("invalid op");
}
}

}
}