package Interpreter;

public class Empresa {
    public static String formulaLucro = "receita - custo";
    public static String formulaMargemLucro = "lucro / receita * 100";

    public static double calcularLucro(double receita, double custo) {
        String expressao;
        expressao = formulaLucro.replace("receita", Double.toString(receita));
        expressao = expressao.replace("custo", Double.toString(custo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
    public static double calcularMargemLucro(double lucro, double receita){
        String expressao;
        expressao = formulaMargemLucro.replace("lucro", Double.toString(lucro));
        expressao = expressao.replace("receita", Double.toString(receita));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();

    }
}
