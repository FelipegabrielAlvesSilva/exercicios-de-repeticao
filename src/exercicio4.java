import java.util.Scanner;

public class exercicio4 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o limite inferior: ");
        int inf = entrada.nextInt();

        System.out.print("Digite o limite superior: ");
        int sup = entrada.nextInt();

        System.out.println("Números pares no intervalo:");

        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }



}
