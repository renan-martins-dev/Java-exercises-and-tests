package Exercises;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise06MovieTheaterSeatReservationSimulator {
    public static void main(String[] args) {
        int TamanhoFileira = 4;
        int TamanhoColuna = 5;
        ExecutarPrograma(TamanhoFileira, TamanhoColuna);
    }
    public static void ExecutarPrograma(int Fileiras, int Colunas) {
        Scanner scanner = new Scanner(System.in);
        char[][] Matriz = InicializarMatriz(Fileiras, Colunas);
        char opc;
        int reservarColuna = 0, reservarFileira = 0;
        do {
            do {
                System.out.println("Selecione a ação:\n1 - Reservar\n2 - Mostra mapa\n3 - Sair");
                opc = scanner.next().charAt(0);
            } while (opc<'1'||opc>'3');
            switch(opc) {
                case '1':
                    do {
                        scanner.nextLine();
                        System.out.println("Digite o número da fileira: ");
                        reservarFileira = scanner.nextInt();
                        if (reservarFileira < 1 || reservarFileira > Fileiras)
                            System.out.printf("Digite um número entre 1 e %d\n", Fileiras);
                    } while (reservarFileira < 1 || reservarFileira > Fileiras);
                    do {
                        scanner.nextLine();
                        System.out.println("Digite o número da coluna: ");
                        reservarColuna = scanner.nextInt();
                        if (reservarColuna < 1 || reservarColuna > Colunas)
                            System.out.printf("Digite um número entre 1 e %d\n", Colunas);
                    } while (reservarColuna < 1 || reservarColuna > Colunas);
                    if (Matriz[reservarFileira-1][reservarColuna-1]==' ')
                    {
                        Matriz[reservarFileira-1][reservarColuna-1]='X';
                    }
                    else
                    {
                        System.out.println("Assento já reservado");
                    }
                    break;
                case '2':
                    MostrarMapa(Matriz);
            }
        } while (opc != '3');
        scanner.close();
    }
    public static char[][] InicializarMatriz(int Fileiras, int Colunas) {
        char[][] NovaMatriz = new char[Fileiras][Colunas];
        for (int i=0; i<Fileiras ;i++){
            for(int j=0; j<Colunas; j++){
                NovaMatriz[i][j] = ' ';
            }
        }
        return NovaMatriz;
    }
    public static void MostrarMapa(char[][] Matriz) {
        System.out.println("Mapa atual");
        int i=0,j=0;
        for(char[] Fileira : Matriz) {
            j=0;
            for(char Coluna : Fileira){
                System.out.print("["+Matriz[i][j]+"]");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}