import java.util.Scanner;

public class Classificar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nDigite sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("\nDigite sua renda mensal em reais: ");
		double renda = scanner.nextDouble();
		System.out.print("\nDigite sua experiência em anos com investimentos: ");
		int experiencia = scanner.nextInt();
		char perfilpreferido;
		do {
		System.out.println("\nDigite o perfil de risco preferido:\n\"c\" para Conservador\n\"m\" para Moderado\n\"a\" para Agressivo");
		perfilpreferido = scanner.next().charAt(0);
		} while (perfilpreferido != 'c' && perfilpreferido != 'm' && perfilpreferido != 'a');
		char crrecomendada;
		if (idade<35 && renda>=8000 && experiencia>=2)
		{
			crrecomendada = 'a';
			System.out.println("\nSua categoria de risco recomendada é: Agressivo");
		}
		else if ((idade>=35 && idade <=50) || (idade<35 && experiencia==0))
		{
			crrecomendada = 'm';
			System.out.println("\nSua categoria de risco recomendada é: Moderado");
		}
		else
		{
			crrecomendada = 'c';
			System.out.println("\nSua categoria de risco recomendada é: Conservador");
		}
		switch(perfilpreferido) {
		case 'c':
			switch(crrecomendada) {
			case 'm':
				if (idade>=34) {
					System.out.println("\nÉ recomendável você se tornar um investidor Conservador depois dos 50 anos.");
					break;
				}
				else {
					System.out.println("\nÉ recomendável você se tornar um investidor Conservador com pelo menos 1 ano de experiência em investimentos");
					break;
				}
			case 'a':
				System.out.println("\nÉ recomendável você se tornar um investidor Conservador depois dos 50 anos ");
				break;
			default:
				System.out.println("\nSeu perfil desejado é o recomendado");
			}
			break;
		case 'm':
			switch(crrecomendada) {
			case 'c':
				if (idade>50) {
					System.out.println("\nÉ recomendável você ser um investidor apenas Conservador");
					break;
				}
			case 'a':
				System.out.println("\nÉ recomendável você se tornar um investidor Moderado entre os 35 e 50 anos ");
				break;
			default:
				System.out.println("\nSeu perfil desejado é o recomendado");
			}
			break;
		default:
			switch(crrecomendada) {
			case 'c':
				if (idade>50) {
					System.out.println("\nÉ recomendável você ser um investidor apenas Conservador");
					break;
				}
				else if (idade>=34) {
					System.out.println("\nNão é recomendável você se tornar um investidor Agressivo em nenhuma hipótese");
					break;
				}
				else {
					System.out.println("\nÉ recomendável você ser um investidor Agressivo com pelo menos 2 anos de experiência em investimentos e pelo menos R$8.000,00 de renda mensal");
					break;
				}
			case 'm':
				if (idade>=33) {
					System.out.println("\nNão é recomendável vocẽ ser um investidor Agressivo em nenhuma hipótese");
					break;
				}
				else {
					System.out.println("\nÉ recomendável você se tornar um investidor Agressivo com pelo menos 2 anos de experiência em investimentos e mais de R$8.000,00 de renda mensal");
					break;
				}	
			default:
				System.out.println("\nSeu perfil desejado é o recomendado");
			}
		}
	}
}