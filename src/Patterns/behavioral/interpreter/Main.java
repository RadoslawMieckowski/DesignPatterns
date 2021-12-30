package Patterns.behavioral.interpreter;

import Patterns.behavioral.interpreter.expressions.AddExpression;
import Patterns.behavioral.interpreter.expressions.MultiplyExpression;
import Patterns.behavioral.interpreter.expressions.SubstractExpression;

public class Main {
    private Engine engine;

    public Main(Engine engine){
        this.engine=engine;
    }
    public int interpret(String input){
        Expression expression=null;
        if(input.contains("add")){
             expression=new AddExpression(input);
        }else if(input.contains("substract")){
             expression=new SubstractExpression(input);
        }else if(input.contains("multiply")){
            expression=new MultiplyExpression(input);
        }
        int result=expression.interpret(engine);
        System.out.println(input);
        return result;
    }


    public static void main(String[] args) {
        Main main=new Main(new Engine());
        System.out.println("Result: "+main.interpret("add 2 and 5"));
        System.out.println("Result: "+main.interpret("multiply 2 and 5"));
        System.out.println("Result: "+main.interpret("multiply 2 and "+main.interpret("substract 17 and 2")));
    }

}
