package Patterns.behavioral.interpreter.expressions;

import Patterns.behavioral.interpreter.Engine;
import Patterns.behavioral.interpreter.Expression;

public class SubstractExpression implements Expression {
    private String expression;

    public SubstractExpression(String expression){
        this.expression=expression;
    }

    @Override
    public int interpret(Engine engine) {
        return engine.substract(expression);
    }
}
