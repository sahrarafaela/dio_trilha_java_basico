public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500; // entende-se que colocar "." após o número ele não fica na unidade de milhar,
                                     // na verdade o número vai valer 2 e 5

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // isso gera erro porque eu atribui o
        // numeroCurso ao tipo inteiro

        short numeroCurto2 = (short) numeroNormal; // é uma forma de resolver o erro citado acima. Se chama casting
        System.out.print(numeroCurto2);
    }
}
