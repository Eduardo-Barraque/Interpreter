package Interpreter;

public class Tesouraria {
    private double receita;
    private double custo;
    private double lucro;

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double calcularLucro() {
        return Empresa.calcularLucro(this.receita, this.custo);
    }
    public double calcularMargemLucro() {
        return Empresa.calcularMargemLucro(this.lucro, this.receita);
    }

}
