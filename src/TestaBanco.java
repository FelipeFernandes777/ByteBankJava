public class TestaBanco {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe Fernandes");
        felipe.setCpf("222.222.222-22");
        felipe.setProfissao("Programador");

        Conta contaDoFelipe = new Conta(500,200);
        contaDoFelipe.deposita(100);

        System.out.println(contaDoFelipe);
    }
}
