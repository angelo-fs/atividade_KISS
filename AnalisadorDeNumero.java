public class AnalisadorDeNumero {
    private final VerificadorNumero verificador;

    public AnalisadorDeNumero(VerificadorNumero verificador) {
        this.verificador = verificador;
    }

    public void analisar(int numero) {
        verificador.verificar(numero);
    }

    public static void main(String[] args) {
        VerificadorNumero verificadorParOuImpar = new VerificadorParOuImpar();
        AnalisadorDeNumero analisador = new AnalisadorDeNumero(verificadorParOuImpar);

        analisador.analisar(7);
        analisador.analisar(10);
    }
}
