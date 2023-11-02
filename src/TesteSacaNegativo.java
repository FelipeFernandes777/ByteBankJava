public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(500,200);

        conta.deposita(100);
        conta.saca(101);

        System.out.println(conta.getSaldo());
    }
}
