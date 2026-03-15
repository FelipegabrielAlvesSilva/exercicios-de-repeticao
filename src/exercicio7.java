import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}

