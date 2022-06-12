import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2();
    }

    static void Ejercicio2 () {
        double a;
        double b;
        double c;
        double d;
        double e;

        System.out.print("Ingresar numero1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.print("Ingresar numero2: ");
        b = scanner.nextDouble();
        System.out.print("Ingresar numero3: ");
        c = scanner.nextDouble();
        System.out.print("Ingresar numero4: ");
        d = scanner.nextDouble();
        System.out.print("Ingresar numero5: ");
        e = scanner.nextDouble();
        scanner.close();

        String simboloPen = "PEN";
        String aPen = String.valueOf(a).concat(simboloPen);
        String bPen = String.valueOf(b).concat(simboloPen);
        String cPen = String.valueOf(c).concat(simboloPen);
        String dPen = String.valueOf(d).concat(simboloPen);
        String ePen = String.valueOf(e).concat(simboloPen);

        double precioTotal = 0.0;

        List<String> listaPrecioSoles = new ArrayList<>();
        listaPrecioSoles.add(aPen);
        listaPrecioSoles.add(bPen);
        listaPrecioSoles.add(cPen);
        listaPrecioSoles.add(dPen);
        listaPrecioSoles.add(ePen);

        for (String elemento: listaPrecioSoles) {
            int indice = elemento.indexOf("PEN"); // me devuelve la posición
            String precioSinPen = elemento.substring(0 , indice); // saco la subcadena de la posicion 0 al indice
            double precioEnNumero = Double.parseDouble(precioSinPen); // Convierto de string a double
            precioTotal = precioTotal + precioEnNumero; //acumulo

        }

        String precioEnSoles = simboloPen.concat(String.valueOf(precioTotal));
        System.out.println("El precio en soles es: " + precioEnSoles);
    }
}
