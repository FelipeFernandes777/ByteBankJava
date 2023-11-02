
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta");
    }

    public void deposita(double valorADepositar) {
        this.saldo += valorADepositar;
    }

    public boolean saca(double valor) {

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        }
        this.saldo -= valor;

        System.out.println("Valor retirado com sucesso! \n Seu saldo agora é de R$" + this.saldo);
        return true;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);

            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero () {
        return this.numero;
    }

    public void setNumero (int numero) {
        if(numero <= 0) {
            System.out.println("Não pode ser um numero negativo ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não pode valor negativos ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular () {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "---------------------------------------------"
                + "\n. Agencia: " + this.agencia
                + ",\n. Numero da Agencia: " + this.numero
                + ",\n. Saldo da conta: R$" + this.saldo
                + ",\n. Titular da conta é: " + this.titular;
    }
}