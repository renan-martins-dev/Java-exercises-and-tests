import java.io.StringReader;
import java.util.Scanner;

public class SimuladorCaixaEletronico {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int Tentativas = 0;
        String Senha = "";
        char opc;
        double Saldo;
        do {
        Tentativas++;
        if (Tentativas > 3) {
            System.out.print("\nACESSO BLOQUEADO");
            scanner.close();
            return;
            }
        System.out.print("\n Digite a senha: ");
        Senha = scanner.next();
        System.out.print("\""+Senha+"\"");
        } while (!Senha.equals("9999"));
        Saldo = 0;
        do {
            do {
                System.out.println("\nOlá usuário, selecione a opção desejada:\nOpção\n1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
                opc = scanner.next().charAt(0);
            } while (opc < '1' || opc > '4');
            switch(opc) {
                case '1':
                    System.out.print("\nSaldo atual: "+ Saldo);
                    break;
                case '2':
                    System.out.print("\nOpção Depositar Escolhida\nDigite o valor para depósito: ");
                    scanner.next();
                    Saldo += scanner.nextDouble();
                    break;
                case '3':
                    System.out.print("\nOpção Sacar Escolhida\nDigite o valor para saque: ");
                    scanner.next();
                    if (Saldo<scanner.nextDouble()){
                        System.out.print("\nSaldo insuficiente!");
                    }
                    else{
                        Saldo -= scanner.nextDouble();
                    }
                    break;
            }
        } while (opc != '4');
        System.out.print("\nEncerrando sistema...");
        scanner.close();
    }
}