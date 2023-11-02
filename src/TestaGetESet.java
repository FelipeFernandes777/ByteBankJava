public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(500,200);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("Felipe Fernandes");

        conta.setTitular(cliente);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        conta.getTitular().setCpf("222.222.222-22");
    }
}
