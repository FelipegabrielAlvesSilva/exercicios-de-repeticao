import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva a nota da prova");
        double nota = entrada.nextDouble();

        while (nota < 0 || nota > 10) {

            System.out.println("Nota inválida,a nota deve ser de 0 a 10,digite novamente");
            nota = entrada.nextDouble();
        }

        System.out.println("Nota válida: " + nota);




    }

}

