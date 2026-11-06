package ExerciciosExtras.ClasseRetangulo;

import java.util.Scanner;

import ExerciciosExtras.ClasseRetangulo.Domain.Rectangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        while (true) {
            System.out.print("Digite a altura do triangulo: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            if (rectangle.setHeight(height) == 1) {
                break;
            }
        }

        while (true) {
            System.out.print("Digite a largura do triangulo: ");
            double width = scanner.nextDouble();
            scanner.nextLine();

            if (rectangle.setWidth(width) == 1) {
                break;
            }
        }

        scanner.close();

        rectangle.printInformation();
    }
}
