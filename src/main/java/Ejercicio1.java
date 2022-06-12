import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1();
    }

    static void Ejercicio1(){
        String a;
        String b;
        String c;
        String d;
        String sEspacio = " ";
        String concatenar = ""; //así se inicializa los strings

        System.out.print("Ingresar string1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        System.out.print("Ingresar string2: ");
        b = scanner.next();
        System.out.print("Ingresar string3: ");
        c = scanner.next();
        System.out.print("Ingresar string4: ");
        d = scanner.next();
        scanner.close();

        List<String> listaStrings = new ArrayList<>(); //Declaro la lista de strings
        listaStrings.add(a);
        listaStrings.add(b);
        listaStrings.add(c);
        listaStrings.add(d);

        for (String elemento: listaStrings) { //For each sirve para recorrer los elementos de la lista
            concatenar = concatenar.concat(sEspacio.concat(elemento));
        }
        System.out.println("La concatenacion de los Strings es: " + concatenar);
    }
}
