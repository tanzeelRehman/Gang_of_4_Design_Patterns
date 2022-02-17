package Interpreter;

public class TerminalExpression implements Expression{
    public TerminalExpression(int number) {
        this.number = number;
    }

    int number;
    @Override
    public int interpret() {
        return number;
    }
}
