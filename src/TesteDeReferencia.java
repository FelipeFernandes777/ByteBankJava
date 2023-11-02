
public class TesteDeReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(30, 50);


        Conta segundaConta = primeiraConta;

        System.out.println("Primeira conta: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta: " + segundaConta.getSaldo());
        System.out.println("Segunda conta: " + segundaConta.getSaldo());
        System.out.println(primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmissima conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}