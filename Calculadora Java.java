import java.util.Scanner;

public class Praticando_Aula1 {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.PintIn("1-Soma\\n2-Subtração\\n3-Multiplicação\\n4-Dibisão\\n5=Sair");
        op = entrada.nextInt();
        System.out.printIn("Digite 2 números: ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        switch (op) {
            case 1:
                System.out.printIn("Soma = " + (n1 + n2));
                break;
            case 2:
                System.out.printIn("Subtração = " + (n1 - n2));
                break;
            case 3:
                System.out.printIn("Multiplicação = " + (n1 * n2));
                break;
            case 4:
                System.out.printIn("Divisão = " + (n1 / n2));
                break;
        }
    }

}
