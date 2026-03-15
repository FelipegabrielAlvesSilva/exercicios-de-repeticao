
    import java.util.Scanner;

    public class exercicio8 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            String maisCaro = "";
            double maiorPreco = 0;
            String resp = "S";

            while (resp.equals("S")) {

                System.out.print("Nome do produto: ");
                String nome = entrada.next();

                System.out.print("Preço do produto: ");
                double preco = entrada.nextDouble();

                if (preco > maiorPreco) {
                    maiorPreco = preco;
                    maisCaro = nome;
                }

                System.out.print("Deseja continuar? (S/N): ");
                resp = entrada.next();
            }

            System.out.println("Produto mais caro: " + maisCaro);
            System.out.println("Preço: " + maiorPreco);

        }
    }

