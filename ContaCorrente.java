//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }


}
