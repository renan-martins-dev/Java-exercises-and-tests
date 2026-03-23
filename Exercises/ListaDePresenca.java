import java.util.Scanner;

public class ListaDePresenca {
    public static void main(String[] args) {
        int QuantidadeAlunos = 5;
        ExibirListaDePresenca(SolicitarNomes(QuantidadeAlunos));
    }

    public static String[] SolicitarNomes(int Alunos) {
        Scanner scanner = new Scanner(System.in);
        String[] Nomes = new String[Alunos];
        for (int i = 0; i<Alunos; i++)
        {
            System.out.printf("Digite o nome do %d aluno: ", i+1);
            Nomes[i] = scanner.next();
        }
        scanner.close();
        return Nomes;
    } 

    public static void ExibirListaDePresenca(String[] Nomes) {
        System.out.print("\n-------- Lista de Presença --------\nNro | Nome do Aluno\n-------------------------");
        int i = 1;
        for (String Aluno : Nomes)
        {
            System.out.printf("\n%03d | %-5s", i, Aluno);
            i++;
        }
        System.out.printf("\n-------------------------\nTotal de alunos: %d\n", Nomes.length);
    }
}