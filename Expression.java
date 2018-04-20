package IngSoft.Interpreter;

import java.util.ArrayList;

/*  Declara una operación abstracta Intérprete que es común a todos
    los nodos del árbol de sintaxis abstracta.
 */
public interface Expression {

    public abstract void interpret(Context context);
}
