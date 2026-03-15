import java.util.Scanner;

public class execicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: ");
        double saldo = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double juros = entrada.nextDouble();

        for (int mes = 1; mes <= 12; mes++) {

            saldo = saldo + (saldo * juros / 100);

            System.out.println("Mês " + mes + ": " + saldo);
        }

    }

}
