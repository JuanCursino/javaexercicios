import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int total = janeiro + fevereiro + marco;

        double media = total / 3.0;

        System.out.println("Despesa total no trimestre: R$" + total);
        System.out.println("Média mensal de gastos: R$" + media);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas de LP1: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double mediaLP1 = (nota1 + nota2) / 2;

        System.out.println("Média do LP1: " + mediaLP1);

        scanner.close();
    }
}



