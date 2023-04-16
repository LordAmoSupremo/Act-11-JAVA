import java.util.Scanner;

public class JavaShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println("Selecciona la figura que deseas calcular:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresa el radio del círculo:");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("El área del círculo es: " + circle.getArea());
                    System.out.println("El perímetro del círculo es: " + circle.getPerimeter());
                    break;
                case 2:
                    System.out.println("Ingresa la base del triángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa la altura del triángulo:");
                    double height = scanner.nextDouble();
                    System.out.println("Ingresa el primer lado del triángulo:");
                    double side1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo lado del triángulo:");
                    double side2 = scanner.nextDouble();
                    System.out.println("Ingresa el tercer lado del triángulo:");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height, side1, side2, side3);
                    System.out.println("El área del triángulo es: " + triangle.getArea());
                    System.out.println("El perímetro del triángulo es: " + triangle.getPerimeter());
                    break;
                case 3:
                    System.out.println("Ingresa el lado del cuadrado:");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println("El área del cuadrado es: " + square.getArea());
                    System.out.println("El perímetro del cuadrado es: " + square.getPerimeter());
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 4);
    }
}