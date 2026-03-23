package Exercises;
import java.util.Scanner;

public class Exercise02DataInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String NomeProd = null;
        double ValorProd = 0;
        double TotalCompra = 0;
        int ItensCompra = 0;
        char opc;
        do {
            System.out.print("\nNome do Produto: ");
            NomeProd = scanner.next();
            scanner.nextLine();
            System.out.print("\nPreço: ");  
            while(!scanner.hasNextDouble() || scanner.nextDouble()<=0){
                System.out.print("\nErro: valor inválido!");
                System.out.print("\nPreço: ");
                scanner.next();
            }
            ValorProd = scanner.nextDouble();
            System.out.print("\nRegistrado: " + NomeProd + " - R$" + ValorProd);
            System.out.print("\nDeseja continuar? (S/N): ");
            TotalCompra += ValorProd;
            ItensCompra ++;
            opc = scanner.next().charAt(0);
            scanner.nextLine();
        }
        while (opc == 's' || opc == 'S');
        System.out.print("Total da compra: " + TotalCompra + " | Quantidade de Itens: " + ItensCompra);
        scanner.close();
    }
}