
public class CriaConta {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta(500,200);

        System.out.println("Saldo primeira conta: R$" +primeiraConta.getSaldo());

        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(500,200);
        System.out.println("Saldo segunda conta: R$" + segundaConta.getSaldo());

        System.out.println("Agencia da primeira conta: " + primeiraConta);
        System.out.println("Numero da primeira conta: " + primeiraConta);

        System.out.println("Agora a segunda conta está na agencia" +
                " " + segundaConta);
    }
}
