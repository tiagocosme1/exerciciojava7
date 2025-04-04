//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("digite um numero inteiro: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO\n");
        }
        else {
            System.out.println("NAO E NEGATIVO\n");
        }
        sc.close();
    }
}
