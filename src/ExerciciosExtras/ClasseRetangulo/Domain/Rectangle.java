package ExerciciosExtras.ClasseRetangulo.Domain;

public class Rectangle {
    private double width;
    private double height;

    private double calculateArea() {
        return width * height;
    }

    private double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void printInformation() {
        System.out.println("O triangulo possue as seguintes informações: ");
        System.out.println("Altura: "+height+"CM");
        System.out.println("Largura: "+width+"CM");
        System.out.println("");
        System.out.println("Sua area é de "+calculateArea()+"CM²");
        System.out.println("Seu Perimetro é de "+calculatePerimeter()+"CM");
    }


    public byte setWidth(double width) {
        if (width <= 0) {
            System.out.println("Invalido, coloca um numero certo, animal");
            System.out.println("----------");
            return 0;
        }

        this.width = width;
        return 1;
    }

    public byte setHeight(double height) {
        if (height <= 0) {
            System.out.println("Invalido, coloca um numero certo, cebeça de bagre");
            System.out.println("----------");
            return 0;
        }
        this.height = height;
        return 1;
    }
}
