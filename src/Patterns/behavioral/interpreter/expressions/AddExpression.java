package Patterns.behavioral.interpreter.expressions;

import Patterns.behavioral.interpreter.Engine;
import Patterns.behavioral.interpreter.Expression;

public class AddExpression implements Expression {
private String expression;

public AddExpression(String expression){
    this.expression=expression;
}
    @Override
    public int interpret(Engine engine) {
        return engine.add(expression);
    }
}
