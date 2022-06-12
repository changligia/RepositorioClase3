import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3();
    }

    static void Ejercicio3() {
        int n1;
        int m2;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el index: ");
        int indexM = scanner.nextInt();
        System.out.print("Ingresar numero1: ");
        n1 = scanner.nextInt();
        System.out.print("Ingresar numero2: ");
        m2 = scanner.nextInt();
        scanner.close();

        List<Integer> listaNumeros = new ArrayList<>();
        for (i=1; i<=n1; i++){
            listaNumeros.add(i);
        }
        try {
            int indiceM = listaNumeros.get(m2);
            System.out.println("jijijiji no me caí");
            System.out.println("El numero entre el 1 y el 10 es:" + indiceM);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("pipipipipipi me caí");
        }finally {
            System.out.println("así se caiga o no yo sigo estudiando mucho");
        }

    }
}

