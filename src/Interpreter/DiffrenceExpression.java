package Interpreter;

public class DiffrenceExpression extends NonTerminalExpression{
    public DiffrenceExpression(Expression leftExp, Expression rightExp) {
        super(leftExp, rightExp);
    }

    @Override
    public int interpret() {
        return leftExp.interpret()-rightExp.interpret();
    }
}
