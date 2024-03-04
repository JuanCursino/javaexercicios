import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Atividade 1
        System.out.println("1 - Idade em dias");
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é: " + idadeEmDias);

        // Atividade 2
        System.out.println("\n2 - Percentual de votos");
        System.out.print("Digite o número total de eleitores: ");
        double totalEleitores = scanner.nextDouble();
        System.out.print("Digite o número de votos brancos: ");
        double votosBrancos = scanner.nextDouble();
        System.out.print("Digite o número de votos nulos: ");
        double votosNulos = scanner.nextDouble();
        System.out.print("Digite o número de votos válidos: ");
        double votosValidos = scanner.nextDouble();
        double percentualBrancos = (votosBrancos / totalEleitores) * 100;
        double percentualNulos = (votosNulos / totalEleitores) * 100;
        double percentualValidos = (votosValidos / totalEleitores) * 100;
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        // Atividade 3
        System.out.println("\n3 - Reajuste salarial");
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();
        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);
        System.out.println("Novo salário: R$" + novoSalario);

        // Atividade 4
        System.out.println("\n4 - Custo final do carro");
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        double percentualDistribuidor = 28;
        double percentualImpostos = 45;
        double custoConsumidor = custoFabrica * (1 + (percentualDistribuidor + percentualImpostos) / 100);
        System.out.println("Custo final do carro ao consumidor: R$" + custoConsumidor);

        // Atividade 5
        System.out.println("\n5 - Salário do vendedor");
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        System.out.print("Digite o valor total das vendas: ");
        double valorVendas = scanner.nextDouble();
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();
        double salarioFinalVendedor = salarioFixo + (carrosVendidos * valorPorCarro) + (valorVendas * 0.05);
        System.out.println("Salário final do vendedor: R$" + salarioFinalVendedor);

        // Atividade 6
        System.out.println("\n6 - Conversão de Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();
        double tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura em Celsius: " + tempCelsius + "°C");

        // Atividade 7
        System.out.println("\n7 - Verificação se o número é maior que 10");
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 10)
            System.out.println("É MAIOR QUE 10!");
        else
            System.out.println("NÃO É MAIOR QUE 10!");

        // Atividade 8
        System.out.println("\n8 - Verificação se o número é positivo ou negativo");
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        if (num >= 0)
            System.out.println("O número é positivo.");
        else
            System.out.println("O número é negativo.");



        // Atividade 9
        System.out.println("\n9 - Cálculo do custo das maçãs");
        System.out.print("Digite o número de maçãs compradas: ");
        int numMacas = scanner.nextInt();
        double custoTotal;
        if (numMacas < 12)
            custoTotal = numMacas * 1.3;
        else
            custoTotal = numMacas * 1;
        System.out.println("Custo total da compra: R$" + custoTotal);


        // Atividade 10
        System.out.println("\n10 - Verificação de aprovação e cálculo da média");
        System.out.print("Digite a nota da 1a. avaliação: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da 2a. avaliação: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno: " + media);
        if (media >= 6)
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno reprovado!");


        // Atividade 11
        System.out.println("\n11 - Verificação de possibilidade de votar");
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade >= 16)
            System.out.println("Pode votar este ano.");
        else
            System.out.println("Não pode votar este ano.");

        // Atividade 12
        System.out.println("\n12 - Identificação do maior valor");
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        if (valor1 > valor2)
            System.out.println("O maior valor é: " + valor1);
        else
            System.out.println("O maior valor é: " + valor2);



        // Atividade 13
        System.out.println("\n13 - Ordenação crescente de dois valores");
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();
        if (a < b)
            System.out.println("Os valores em ordem crescente são: " + a + ", " + b);
        else
            System.out.println("Os valores em ordem crescente são: " + b + ", " + a);


        // Atividade 14
        System.out.println("\n14 - Cálculo da duração do jogo de xadrez");
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();
        int duracaoJogo;
        if (horaInicio < horaFim)
            duracaoJogo = horaFim - horaInicio;
        else
            duracaoJogo = 24 - horaInicio + horaFim;
        System.out.println("A duração do jogo foi de " + duracaoJogo + " horas.");

        // Atividade 15
        System.out.println("\n15 - Cálculo do salário total do funcionário");
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();
        double salarioTotal;
        if (horasTrabalhadas <= 40) {
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            double horasExtras = horasTrabalhadas - 40;
            salarioTotal = 40 * salarioHora + horasExtras * salarioHora * 1.5;
        }
        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

    }
}



                                         // Teste de mesa

// Atividade 1
// Começo: anos = 25, meses = 6, dias = 15 
// Resultado: 9365 dias

// Atividade 2 
// Começo: totalEleitores = 1000, votosBrancos = 50, votosNulos = 100, votosValidos = 800 
// Resultado: 
// Percentual de votos brancos: 5% 
// Percentual de votos nulos: 10% 
// Percentual de votos válidos: 80%

// Atividade 3
// Começo: salarioAtual = 2000, percentualReajuste = 10 
// Resultado: Novo salário: R$2200.0

// Atividade 4
// Começo: custoFabrica = 20000 
// Resultado: Custo final do carro ao consumidor: R$34600.0

// Atividade 5
// Começo: carrosVendidos = 10, valorVendas = 20000, salarioFixo = 1500, valorPorCarro = 500 
// Resultado: Salário final do vendedor: R$4000.0

// Atividade 6
// Começo: tempFahrenheit = 98.6 
// Resultado: Temperatura em Celsius: 37.0°C

// Atividade 7 
// Começo: numero = 15 
// Resultado: É MAIOR QUE 10!

// Atividade 8 
// Começo: num = -5 
// Resultado: O número é negativo.

// Atividade 9
// Começo: numMacas = 15 
// Resultado: Custo total da compra: R$15.0

// Atividade 10: Verificação de aprovação e cálculo da média 
// Começo: nota1 = 7, nota2 = 8 
// Resultado: 
// Média do aluno: 7.5 
// Aluno aprovado!

// Atividade 11 
// Começo: anoAtual = 2024, anoNascimento = 2006 
// Resultado: Pode votar este ano.

// Atividade 12 
// Começo: valor1 = 25, valor2 = 40 
// Resultado: O maior valor é: 40

// Atividade 13
// Começo: a = 15, b = 8 
// Resultado: Os valores em ordem crescente são: 8.0, 15.0

// Atividade 14
// Começo: horaInicio = 22, horaFim = 3 
// Resultado: A duração do jogo foi de 5 horas.

// Atividade 15
// Começo: horasTrabalhadas = 45, salarioHora = 10 
// Resultado: O salário total do funcionário é: R$475.0


