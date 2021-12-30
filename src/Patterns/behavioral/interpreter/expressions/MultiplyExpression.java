package Patterns.behavioral.interpreter.expressions;

import Patterns.behavioral.interpreter.Engine;
import Patterns.behavioral.interpreter.Expression;

public class MultiplyExpression implements Expression {
private String expression;

public MultiplyExpression(String expression){
    this.expression=expression;
}
    @Override
    public int interpret(Engine engine) {
        return engine.multiply(expression);
    }
}
