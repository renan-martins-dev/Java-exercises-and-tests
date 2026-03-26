package Exercises;

import java.util.Scanner;

public class Exercise05SystemSecurityAnalysisSimulator {
    public static void main(String[] args) {
        String[] Arquivos = {"root/sys/kernel.dat", "users/admin/private_passwords.txt", "users/admin/python_projects/calculator.py", "users/admin/java_exercises/README.md"};
        exibirIntroducao();
        executarVarredura(Arquivos);
        exibirDesfecho();
    }
    public static void exibirIntroducao() {
        System.out.println("\u001B[0m\n[SISTEMA] Iniciando varredura...");
    }
    public static void executarVarredura(String[] Arquivos) {
        int z = 1;
        for (String arquivo : Arquivos)
        {
            if (arquivo.contains("private")||arquivo.contains("password")) 
                System.out.printf("\n\u001B[31m(%d/%d) [ALERTA] Arquivo Restrito: \u001B[0m", z, Arquivos.length);
            else 
                System.out.printf("\n\u001B[32m(%d/%d) Analisando: \u001B[0m", z, Arquivos.length);
            System.out.println(arquivo);
            for(int i=0; i<=100;i++)
            {
                System.out.printf("\rProgresso: \u001B[36m[");
                for(int j=1;j<=10;j++)
                {
                    if(i>=j*10) System.out.printf("#");
                    else System.out.printf("-");
                }
                System.out.printf("]\u001B[0m %d ", i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}
            }
                if (arquivo.contains("private")||arquivo.contains("password"))
                    System.out.println("-> OK!");
                else 
                    System.out.println("-> OK!");
            z++;
        }
    }
    public static void exibirDesfecho() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\u001B[1;33mTE PEGUEI! PEGADINHA! O SISTEMA ESTÁ SEGURO.\u001B[0m");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }
}