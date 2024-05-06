import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Contraseñas");
            System.out.println("2. Costo de Automóvil");
            System.out.println("3. Cantidad de Segundos por Día");
            System.out.println("4. Area de un Círculo");
            System.out.println("5. Area de un Triángulo");
            System.out.println("6. Información del Estudiante");
            System.out.println("0. Salir\n");
            System.out.print("Escoja alguna de las opciones: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ejecutarContraseñas();
                    break;
                case 2:
                    ejecutarCostoAuto();
                    break;
                case 3:
                    ejecutarSecondsByDay();
                    break;
                case 4:
                    ejecutarAreaCirculo();
                    break;
                case 5:
                    ejecutarAreaTriangulo();
                    break;
                case 6:
                    ejecutarInfoEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

    public static void ejecutarContraseñas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de las contraseñas:");
        int longitud = scanner.nextInt();
        Password[] passwords = new Password[5]; // Cambiar el tamaño según sea necesario
        boolean[] strongPasswords = new boolean[passwords.length];

        for (int i = 0; i < passwords.length; i++) {
            System.out.println("Ingrese la contraseña " + (i + 1) + ":");
            String pass = scanner.next();
            passwords[i] = new Password(pass);
            strongPasswords[i] = passwords[i].isStrong();
        }

        System.out.println("Contraseñas y su fortaleza:");
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwords[i].getPassword() + " " + strongPasswords[i]);
        }
    }

    public static void ejecutarCostoAuto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el costo del automóvil:");
        double costoAuto = scanner.nextDouble();
        CostoAuto auto = new CostoAuto(costoAuto);
        System.out.println("Costo final para el consumidor: " + auto.calcularCostoFinal());
    }

    public static void ejecutarSecondsByDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de días:");
        int dias = scanner.nextInt();
        SecondsByDay segundosByDay = new SecondsByDay(dias);
        System.out.println("Cantidad de segundos: " + segundosByDay.calcularSegundos());
    }

    public static void ejecutarAreaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("Area del círculo: " + circulo.calcularArea());
    }

    public static void ejecutarAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }

    public static void ejecutarInfoEstudiante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.next();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese la calificación del estudiante:");
        int calificacion = scanner.nextInt();
        Estudiante estudiante = new Estudiante(nombre, edad, calificacion);
        estudiante.printStudentInfo();
    }
}