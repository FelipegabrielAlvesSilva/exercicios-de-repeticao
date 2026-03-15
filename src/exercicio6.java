
    import java.util.Scanner;

    public class exercicio6 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int soma=0;
            float cont=0;

            System.out.println("Escreva a idade do aluno (negativo para parar)");
            int idade = entrada.nextInt();

            while (idade >=0) {

                soma = soma +idade;
                cont++;

                System.out.println("Escreva a idade do aluno (negativo para parar)");
                idade = entrada.nextInt();
            }

            float media= soma/cont;

            System.out.println("A media é = " + media);
        }
    }

