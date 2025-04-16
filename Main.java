public class Main {
    public static void main(String[] args) {
        VerificadorNumero verificador = new VerificadorParOuImpar();
        AnalisadorDeNumero analisador = new AnalisadorDeNumero(verificador);

        analisador.analisar(7);
        analisador.analisar(10);
    }
}
