import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner sc = new Scanner(System.in);


    public static String leerCadena(String mensaje) {
        System.out.printf("%s: ", mensaje);
        String cadenaintroducida = sc.nextLine(); // Este apartado podemos quitarlo y poner solo return sc.nextLline();
        return cadenaintroducida;
    }




    public static int leerEntero(String mensaje) {
        System.out.printf("%s: ", mensaje);
        int numero = Integer.parseInt(sc.nextLine()); // convierte una cadena String en un entero
        return numero;
    }




    public static int leerEnteroPositivo(String mensaje) {
        System.out.printf("%s: ", mensaje);
        int numeropositivo;
        do {
            numeropositivo = Integer.parseInt(sc.nextLine());
            if (numeropositivo <= 0) {
                System.out.println("Introduce un numero positivo");
            }
        } while (numeropositivo <= 0);




        int LeerEnteroPositivo = Integer.parseInt(sc.nextLine()); // convierte una cadena String en un entero
        return numeropositivo;




    }


    public static String leerSiNo(String mensaje) {
        System.out.printf("%s: ", mensaje);
        String palabra = sc.nextLine();
        return palabra;
    }

    public static char leerLetra(String caracter) {
        System.out.printf("%s: ", caracter);
        return  sc.nextLine().charAt(0);
    }



    static void main(String[] args) {
        String palabra1 = leerSiNo("Dime Si o No");
        System.out.println("Tú mensaje es: " + palabra1);
    }
}
