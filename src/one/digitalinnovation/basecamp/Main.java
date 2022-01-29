package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício retornos:");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(7,9);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(6,4,3);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
