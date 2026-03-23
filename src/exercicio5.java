import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva seu nome");

        String nome = entrada.next();

        System.out.println("Escreva sua senha");

        String senha = entrada.next();

        //equalsIgnoreCase é usado para comprarar 2 Strings porem o ignore vai ignora
        // a diferença de letra maiuscula ou minusculas
        while (senha.equalsIgnoreCase(nome)) {

            System.out.println("Senha inválida,a senha deve diferente de seu nome ,digite novamente");
            senha = entrada.next();
        }

        System.out.println("Senha válida!");

    }
}
