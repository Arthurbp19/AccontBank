import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando as variaveis
        Scanner scanner = new Scanner(System.in);
        String nome = "Arthur bergamasco Palopoli";
        double saldo = 2500.00;
        String tipoConta = "Corrente";

        //Iniciando
        System.out.println("********************************** \n Dados iniciais do cliente\n \n Nome: " +
                nome + "\n Tipo da Conta: " + tipoConta + "\n Saldo inicial: " + saldo + "\n **********************************");

        while (true) {
            System.out.println("\n Operações \n\n 1- Consultar Saldo \n 2- Receber Valor \n 3- Transferir Valor \n 4- Sair");
            System.out.println("\n\n Digite a opção desejada");

            //Operações
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("\nSeu saldo é de R$ " + saldo);
                    break;
                case 2:
                    System.out.println("\nDigite o valor que deseja receber: ");
                    double receber = scanner.nextDouble();
                    if (receber > 0) {
                        saldo += receber;
                        System.out.println("Seu novo saldo é de R$" + saldo);
                    } else {
                        System.out.println("Valor invalido. Digite um numero positivo");
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o valor que deseja tranferir");
                    double transferencia = scanner.nextDouble();
                    if (transferencia > 0 && transferencia <= saldo) {
                        saldo -= transferencia;
                        System.out.println("Seu nomo saldo é de R$"  + saldo);
                    } else if (transferencia > saldo) {
                        System.out.println("Saldo insuficiente para a transferencia");
                    } else {
                        System.out.println("Digite um numero positivo");
                    }
                    break;
                case 4:
                    System.out.println("Saindo..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção invalida. Tente novamente");
                    break;

            }
        }
    }
}
