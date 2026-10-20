import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota:\n");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:\n");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota:\n");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }


        teclado.close();
    }
}

