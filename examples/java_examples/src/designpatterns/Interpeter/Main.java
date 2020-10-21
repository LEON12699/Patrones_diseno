
package designpatterns.Interpeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static Scanner read;

	public static void main(String[] args) {
        read = new Scanner(System.in);
        System.out.println(".:: Roman Numeral ::. \n");
        System.out.print("Enter the Roman number:");
        String number = read.nextLine();
       //number = number.trim();
        Context context = new Context(number);
        
     
        ArrayList<Expression> interpreters = new ArrayList<>();
        interpreters.add(new HundredExpression());
        interpreters.add(new TenExpression());
        interpreters.add(new BasicExpression());

        Iterator<Expression> it = interpreters.iterator();
        
        while (it.hasNext()) {
            Expression exp  = it.next();
            exp.interpret(context);
        }
        
        System.out.println("the value number is :"+ context.out);
    }
}
