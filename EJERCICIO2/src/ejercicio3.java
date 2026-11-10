

static void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un numero ");
    int num = sc.nextInt();


    int inverso = 0;

    while (num > 0) {
        int ultdigito = (num % 10);
        inverso= inverso * 10 +ultdigito;
        num= num/10;
    }
    System.out.println("El numero inverso es " + inverso);
}
/*Para invertir el número 123456, utilizamos tres operaciones matemáticas:

ultimodigito: num % 10: obtiene el último dígito del número.(Calcula el resto de una división)
123456 % 10
12345 % 10
789 % 10
42 % 10
7 % 10
ultimoDigito: se declara dentro porque solo se necesita en cada iteración.

inverso * 10 + udigito: añade ese dígito al final del número inverso.

 num=num/10: elimina el último dígito del número original mediante división entera.

123456 / 10
6

12345 / 10
5
789 / 10
9
42 / 10
 2
7 / 10
7
 */