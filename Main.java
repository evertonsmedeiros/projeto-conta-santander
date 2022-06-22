//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();


        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        ArrayList<ContaCorrente> conta = new ArrayList<ContaCorrente>();


        String opcao = "";
        String escolhacC= "";
        double valor;



        Scanner teclado = new Scanner(System.in);
        Cliente clie = new Cliente();
        Conta contac = new ContaCorrente(clie);
        Conta contaPoupanca = new ContaPoupanca(clie);



            System.out.println("*------------------------------------------------------------*");
            System.out.println("|Bem vindo ao Sandtaander!                                        |");
            System.out.println("|Aqui é possível: criar conta, depositar, sacar e transferir.|");
            System.out.println("*------------------------------------------------------------*");


            System.out.println("*------------------------------------------------------------*");
            System.out.println("|0 - Sair                                                    |");
            System.out.println("|1 - Criar Conta corrente                                             |");
            System.out.println("|2 - criar connta poupança                                  |");
            System.out.println("|3 - Depositar        |");
            System.out.println("|4 - Visualizar Dados Pelo CPF                               |");


            System.out.println("*------------------------------------------------------------*");
        do {




            System.out.print("Informe a opção: ");
            opcao = teclado.nextLine();
            if (opcao.equalsIgnoreCase("1")) {

                System.out.println("-> CRIAR CONTA corrente");
                System.out.print("Informe o nome da pessoa: ");
                clie.getNome();
                clie.setNome(teclado.nextLine());
                System.out.print("Informe o CPF da pessoa: ");
                clie.getCpf();
                clie.setCpf(teclado.nextLine());
                contac.imprimirExtrato();
                System.out.println(" deposita-1-, sacar -2- tranferir-3- sair-4-");
                opcao = teclado.nextLine();
                if (opcao.equalsIgnoreCase("1")) {

                    System.out.println("digite o valor");

                    valor = teclado.nextDouble();
                    contac.depositar(valor);
                    contac.imprimirExtrato();
                }if (opcao.equalsIgnoreCase("2")) {
                    System.out.println("digite o valor");
                    valor = teclado.nextDouble();
                    contac.sacar(valor);
                    contac.imprimirExtrato();
                }
                if (opcao.equalsIgnoreCase("3")) {
                    System.out.println("digite o valor");
                    valor = teclado.nextDouble();
                    contac.transferir(valor,contaPoupanca);
                    contac.imprimirExtrato();
                }

                contac.imprimirExtrato();
                contasBancarias.add(clie);



            }
            if (opcao.equalsIgnoreCase("2")) {

                System.out.println("-> CRIAR CONTA POUPANÇA");

                System.out.print("Informe o nome da pessoa: ");
                clie.getNome();
                clie.setNome(teclado.nextLine());
                System.out.print("Informe o CPF da pessoa: ");
                clie.getCpf();
                clie.setCpf(teclado.nextLine());

                contaPoupanca.imprimirExtrato();
                System.out.println(" deposita-1-, sacar -2- tranferir-3- sair-4-");
                opcao = teclado.nextLine();
                if (opcao.equalsIgnoreCase("1")) {

                    System.out.println("digite o valor");

                    valor = teclado.nextDouble();
                    contaPoupanca.depositar(valor);
                    contaPoupanca.imprimirExtrato();
                }if (opcao.equalsIgnoreCase("2")) {
                    System.out.println("digite o valor");
                    valor = teclado.nextDouble();
                    contaPoupanca.sacar(valor);
                    contaPoupanca.imprimirExtrato();
                }
                if (opcao.equalsIgnoreCase("3")) {
                    System.out.println("digite o valor");
                    valor = teclado.nextDouble();
                    contaPoupanca.transferir(valor,contac);
                    contaPoupanca.imprimirExtrato();
                }

                contasBancarias.add(clie);

                contasBancarias.add(clie);
                contaPoupanca.imprimirExtrato();






            }



        if (opcao.equalsIgnoreCase("3")){
            System.out.println("informe cpf");
            opcao = teclado.nextLine();
            contac.visulisa();

            }







        } while (!opcao.equalsIgnoreCase("0"));
        System.out.println("agradecemos a sua visita");


        for (Conta conta1: contasBancarias){

            System.out.println(conta1);



        }



    }
}


