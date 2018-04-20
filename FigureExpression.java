package IngSoft.Interpreter;

public class FigureExpression implements Expression {

    private int line;

    public FigureExpression(int line) {
        this.line = line;
    }

    @Override
    public void interpret(Context context) {
        String note = context.getNote(line);
        context.setFigure(note);
    }
}
