public class TestaMetodo {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(500,200);

        primeiraConta.deposita(100);
        System.out.println(primeiraConta);
        primeiraConta.saca(20);

        Conta segundaConda = new Conta(500,200);
        segundaConda.deposita(1000);

        if(segundaConda.transfere(200, primeiraConta)){
            System.out.println("Transferencia feita com sucesso");
        }else {
            System.out.println("Sem dinheiro");
        }

        System.out.println(segundaConda);
        System.out.println(primeiraConta);
    }
}
