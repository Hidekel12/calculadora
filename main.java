
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero:");
        float numero1 = sc.nextFloat();

        System.out.println("Digite el segundo numero:");
        float numero2 = sc.nextFloat();

        System.out.println("Digite el número de la operación a realizar: 1: suma, 2: resta, 3: multiplicación, 4: división");
        int opcion = sc.nextInt();

        float resultado = 0;
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("División por cero no permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El resultado de la operación es: " + resultado);
        sc.close();
    }
}

