public class StudentController {
    public static void main(String[] args) {
        System.out.println("Hello from StudentController");

        // Probando el nuevo método
        showStudent("Gabriel");
        double promedio = calculateAverage(15, 18, 20);
        System.out.println("El promedio calculado es: " + promedio);
    }

    // Método existente
    public static void showStudent(String name) {
        System.out.println("Mostrando información del estudiante: " + name);
    }

    // Nuevo método agregado por el Responsable
    public static double calculateAverage(int nota1, int nota2, int nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}
