package Interpreter;

public class SumExpression extends NonTerminalExpression {
    SumExpression(Expression leftExp, Expression rightExp){
        super(leftExp, rightExp);

    }

    @Override
    public int interpret() {
        return leftExp.interpret()+rightExp.interpret();
    }
}
