package IngSoft.Interpreter;

/**
 Contiene información global para el interpretador.
 Representa el contexto que envuelve al lenguaje. Puede contener información
 específica aplicable a todas las expresiones.
 Si no hay información específica, Context es prescindible.

 Para este ejemplo se utilizará el lenguaje musical, donde el cliente inserta un contexto de tipo
 "figura musical" + "línea en la que se encuentra en el pentagrama"
 */
public class Context {
    private String figure; //maxima|longa|cuadrada|redonda|blanca|negra|corchea|semicorchea|fusa|semifusa
                           //garrapatea|semigarrapatea
    private String time;   //[1..15] contando de abajo hacia arriba
    private String result;  //Do|Re|Mi|Fa|Sol|La|Si + tiempo de duración

    /**
     * @param line es el número de la línea en la que está la figura
     * @return nombre de la nota musica
     */
    public String getNote(int line) {
        switch (line) {
            case 1:
            case 8:
            case 15:
                return "do";
            case 2:
            case 9:
                return "re";
            case 3:
            case 10:
                return "mi";
            case 4:
            case 11:
                return "fa";
            case 5:
            case 12:
                return "sol";
            case 6:
            case 13:
                return "la";
            case 7:
            case 14:
                return "si";
                default: throw new IllegalArgumentException("Línea fuera de rango: " + line);
        }
    }

    public String getTime(String note) {
        switch (note) {
            case "maxima"        : return "32";  //
            case "longa"         : return "16";
            case "cuadrada"      : return "8";
            case "redonda"       : return "4";
            case "blanca"        : return "2";
            case "negra"         : return "1";
            case "corchea"       : return "1/2";
            case "semicorchea"   : return "1/4";
            case "fusa"          : return "1/8";
            case "semifusa"      : return "1/16";
            case "garrapatea"    : return "1/32";
            case "semigarrapatea": return "1/64";

            default: throw new IllegalArgumentException("The first argument is not valid: " + note);

        }
    }

    public void calculate() {
        result = figure + " " + time;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResult() {
        return figure + " " + time;
    }
}
