public class VerificadorParOuImpar implements VerificadorNumero {
        @Override
        public void verificar(int numero) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }
}
