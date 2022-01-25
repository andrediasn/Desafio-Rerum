public class CaixaEletronico {
    public CaixaEletronico() {}

    public Saque Calcula(int valor){
        int notas100 = valor / 100;
        int resto = valor % 100;
        int notas50 = resto / 50;
        resto = resto % 50;
        int notas20 = resto / 20;
        resto = resto % 20;
        int notas10 = resto / 10;
        resto = resto % 10;

        return new Saque(notas100, notas50, notas20, notas10);
    }
}
