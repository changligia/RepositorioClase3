package ex5;

import ex4.Computadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edad1, edad2;
        String nombre1, nombre2;
        double peso1, peso2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar edad1: ");
        edad1 = scanner.nextInt();
        System.out.print("Ingresar peso1: ");
        peso1 = scanner.nextDouble();
        System.out.print("Ingresar nombre1: ");
        nombre1 = scanner.next();
        System.out.print("Ingresar edad2: ");
        edad2 = scanner.nextInt();
        System.out.print("Ingresar peso2: ");
        peso2 = scanner.nextDouble();
        System.out.print("Ingresar nombre2: ");
        nombre2 = scanner.next();
        scanner.close();

        Oso oso1 = new Oso(); //Instancio el objeto oso1 vacío y le asigno los valores1 con el set
        oso1.setNombre(nombre1);
        oso1.setEdad(edad1);  //Asignando valores1
        oso1.setPeso(peso1);

        Oso oso2 = new Oso(edad2, nombre2, peso2); //Instancio el objeto oso2 con parametros del constructor

        System.out.println("El nombre1 de oso1 es: " + oso1.getNombre());
        System.out.println("El nombre2 de oso2 es: " + oso2.getNombre());

        if (oso1.getNombre() != oso2.getNombre()){
            System.out.println("Los nombres NO son iguales");
        }
        else{
            System.out.println("Los nombres son iguales");
        }

        System.out.println("La edad1 de oso1 es: " + oso1.getEdad());
        System.out.println("La edad2 de oso2 es: " + oso2.getEdad());

        if (oso1.getEdad() != oso2.getEdad()){
            System.out.println("Las edades NO son iguales");
        }
        else{
            System.out.println("Las edades son iguales");
        }

        System.out.println("La peso1 de oso1 es: " + oso1.getPeso());
        System.out.println("La peso2 de oso2 es: " + oso2.getPeso());

        if (oso1.getPeso() != oso2.getPeso()){
            System.out.println("Los pesos NO son iguales");
        }
        else{
            System.out.println("Los pesos son iguales");
        }

    }
}

