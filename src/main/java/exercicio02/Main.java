package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main app = new Main();
        app.start();

    }

    private void start() {

        System.out.print("Digite o valor do produto: ");

        Scanner ler = new Scanner(System.in);

        double valor = ler.nextDouble();

        int valorComCast = (int) valor;

        System.out.println("Valor com casa decimais: " + valor + " | Valor inteiro: " + valorComCast);


    }

}