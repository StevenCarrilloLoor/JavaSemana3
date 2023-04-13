import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio = new Duenio("Carlos","1715607071");
        Motor motor = new Motor("WXZ123456",1.6,"diesel");
        Auto auto = new Auto("PDE1234","Corolla", "Toyota", motor, duenio, 4);
        Duenio duenio1 = new Duenio("Pepe","10298983");
        Motor motor1=new Motor("WX37382",2.1,"Gasofa");
        Auto auto1=new Auto("PDO321", "Motorola", "Kia", motor1,duenio1,4);
        auto.imprimir_atributos();
        System.out.println("---------------------------------------------");
        auto1.imprimir_atributos();
        System.out.println("Ingrese la marca del vehiculo: ");
        Scanner sc=new Scanner(System.in);
        String marca = sc.next();
        System.out.println("Ingrese la placa: ");
        String placa =sc.next();
        System.out.println("Ingrese el modelo: ");
        String modelo =sc.next();
        System.out.println("Ingrese cilindraje: ");
        double cilindraje=sc.nextDouble();
        auto1.setMarca(marca);
        auto1.setModelo(modelo);
        auto1.getMotor().setCilindraje(cilindraje);
        auto1.setPlaca(placa);
        auto1.imprimir_atributos();


    }
}