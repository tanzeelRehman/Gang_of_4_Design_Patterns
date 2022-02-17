package Interpreter;

public class ProductExpression extends  NonTerminalExpression{
    public ProductExpression(Expression leftExp, Expression rightExp) {
         super(leftExp, rightExp);
    }

    @Override
    public int interpret() {
        return leftExp.interpret()*rightExp.interpret();
    }
}
