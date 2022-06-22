//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Cliente extends Conta {
    public String nome;
    private String cpf;

    public Cliente() {
        super();

    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    };

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo='" + saldo + '\'' +
                ", agencia='" + agencia + '\'' +



                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;




    }


    @Override
    public void imprimirExtrato() {

    }
}
