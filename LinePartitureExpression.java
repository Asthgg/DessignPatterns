package IngSoft.Interpreter;

public class LinePartitureExpression implements Expression{
    private String figure;

    public LinePartitureExpression(String figure) {
        this.figure = figure;
    }

    @Override
    public void interpret(Context context) {
        String time = context.getTime(figure);
        context.setTime(time);
    }
}
