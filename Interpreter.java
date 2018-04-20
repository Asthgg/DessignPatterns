package IngSoft.Interpreter;

import java.util.ArrayList;

public class Interpreter {

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "semicorchea";
        args[1] = "2";
        ArrayList<Expression> tree = new ArrayList();
        Context context = new Context();

        boolean isNumber = false;
        int line = -1;

        for(String token : args) {

            try {
                line = Integer.parseInt(token);
                isNumber = true;

            } catch (Exception e) {
                isNumber = false;
            }

            if(isNumber) {
                tree.add(new FigureExpression(line));

            } else {
                tree.add(new LinePartitureExpression(token));
            }
        }

        for (Expression e : tree) {
            e.interpret(context);
        }
        System.out.println("Interpretado: " + context.getResult());
    }
}
