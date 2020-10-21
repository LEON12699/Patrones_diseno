
package designpatterns.Interpeter;


public abstract class Expression {
    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int  multiplier();

    public void interpret(Context context){
        if (context.input.startsWith(nine())) {
            context.out += 9*multiplier();
            context.input=context.input.substring(nine().length());
        }
        else if(context.input.startsWith(four())){
            context.out+= 4*multiplier();
            context.input=context.input.substring(four().length());
            
        }
        else if(context.input.startsWith(five())){
            context.out+= 5*multiplier();
            context.input=context.input.substring(five().length());
            
        }
        while (context.input.startsWith(one())) {
            context.out +=1*multiplier();
            context.input=context.input.substring(one().length());
        }
    }

}
