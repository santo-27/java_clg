

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
String wish = scanner.nextLine();
if(wish.equals("n")){
break;
}
a = scanner.nextFloat();
b = scanner.nextFloat();

switch(wish){
case "+":
System.out.printf(calc.add(a,b));
break;

case "-":
System.out.printf(calc.sub(a,b));
break;

case "*":
System.out.printf(calc.mul(a,b));
break;

case "/":
System.out.printf(calc.div(a,b));
break;

case "%":
System.out.printf(calc.mod(a,b));
break;

default:
System.out.printf("invalid op");
}
}

}
}