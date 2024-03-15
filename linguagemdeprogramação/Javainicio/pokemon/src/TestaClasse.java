public class TestaClasse {
    // Atributos 
    private int numerador;
    private int denominador;
  
    public TestaClasse(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    // Métodos

    public TestaClasse somar(TestaClasse F) {
        if (this.denominador == F.denominador) {
            int novoNumerador = this.numerador + F.numerador;
            return new TestaClasse(novoNumerador, this.denominador);
        } else {
            int novoNumerador = this.numerador * F.denominador + F.numerador * this.denominador;
            int novoDenominador = this.denominador * F.denominador;
            return new TestaClasse(novoNumerador, novoDenominador);
        }
    }

    public TestaClasse subtrair(TestaClasse F) {
        if (this.denominador == F.denominador) {
            int novoNumerador = this.numerador - F.numerador;
            return new TestaClasse(novoNumerador, this.denominador);
        } else {
            int novoNumerador = this.numerador * F.denominador - F.numerador * this.denominador;
            int novoDenominador = this.denominador * F.denominador;
            return new TestaClasse(novoNumerador, novoDenominador);
        }
    }

    public TestaClasse multiplicar(TestaClasse F) {
        int novoNumerador = this.numerador * F.numerador;
        int novoDenominador = this.denominador * F.denominador;
        return new TestaClasse(novoNumerador, novoDenominador);
    }

    public TestaClasse dividir(TestaClasse F) {
        int novoNumerador = this.numerador * F.denominador;
        int novoDenominador = this.denominador * F.numerador;
        return new TestaClasse(novoNumerador, novoDenominador);
    }
}
