package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String id;
        String marca;
        double peso;
        double precio;
        int ramEnGb;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el id: ");
        id = scanner.nextLine();
        System.out.print("Ingresar la marca: ");
        marca = scanner.nextLine();
        System.out.print("Ingresar el peso: ");
        peso = scanner.nextDouble();
        System.out.print("Ingresar el precio: ");
        precio = scanner.nextDouble();
        System.out.print("Ingresar el ramEnGb: ");
        ramEnGb = scanner.nextInt();
        scanner.close();

        Computadora computadora1 = new Computadora(id, precio, marca); //Declaro el objeto computadora
        computadora1.setPeso(peso);
        computadora1.setRamEnGb(ramEnGb);

        System.out.println("El id de la computadora es: " + computadora1.getId());
        System.out.println("El precio en soles es: " + computadora1.getPrecio());
        System.out.println("La marca es: " + computadora1.getMarca());
        System.out.println("El peso en Kg. es: " + computadora1.getPeso());
        System.out.println("La memoria RAM en GB es: " + computadora1.getRamEnGb());
    }
}

