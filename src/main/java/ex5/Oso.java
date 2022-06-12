package ex5;

public class Oso {
    private int edad;
    private String nombre;
    private double peso;


    //Constructor Vacío
    public Oso(){

    }

    //Metodo gritar
    public static void gritar(){
        System.out.println("roarrr");
    }

    //Metodo decir
    public static void decir (){
        System.out.println("zzzz");
    }

    //Metodo mostrar
    public static void decirDatosOso(){
        System.out.println("La edad del oso es: ");
        System.out.println("El nombre del oso es: ");
        System.out.println("El peso del oso es: ");
    }

    //Constructor con parametros
    public Oso(int edad, String nombre, double peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
