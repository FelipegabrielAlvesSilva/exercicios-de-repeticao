import java.util.Scanner;

public class exercio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = entrada.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        ;


    }
}
