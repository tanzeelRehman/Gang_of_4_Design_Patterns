package Interpreter;

public abstract class NonTerminalExpression implements Expression {
    Expression leftExp;

    public NonTerminalExpression(Expression leftExp, Expression rightExp) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
    }

    Expression rightExp;

    @Override
    public int interpret() {
        return 0;
    }
}
