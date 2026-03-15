import java.util.Scanner;

public class exercicio2 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de números a serem somados");
        int quant= entrada.nextInt();
        int soma = 0;

        System.out.println("A Soma será de 1 a "+quant);
        for(int i = 1; i <=quant; i++){
           soma = soma + i;

            System.out.println("A "+i+"º soma é "+soma);
        }






    }
}