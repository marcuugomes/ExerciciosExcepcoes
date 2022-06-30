package excepcoes.src.ex3;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        Temperatura temperaturaAtual = new Temperatura();
        temperaturaAtual.setFahrenheit(fahrenheit);
    }
}
