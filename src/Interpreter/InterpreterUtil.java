package Interpreter;

public class InterpreterUtil {

    static boolean isOperator(String op){
        return  op.equals("*")|| op.equals("+") || op.equals("-");
    }

    static Expression getOperator(String op, Expression left, Expression right){
       return switch (op){
           case "+" -> new SumExpression(left, right);
           case "-" -> new DiffrenceExpression(left, right);
           case "*" -> new ProductExpression(left, right);
           default -> null;
       };
    }
}
