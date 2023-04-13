import com.sun.security.jgss.GSSUtil;

public class Auto {

    String placa;
    String modelo;
    int anio;
    String marca;

    Motor motor;

    Duenio duenio;

    int numRuedas;


    public Auto(){

    }

    public Auto(String placa, String modelo, String marca, Motor motor, Duenio duenio, int numRuedas){
        this.placa=placa;
        this.modelo=modelo;
        this.marca=marca;
        this.motor=motor;
        this.duenio=duenio;
        this.numRuedas=numRuedas;
    }


    double velocidad(int a){
        double velocidadKmh=0;
        switch (a){
            case 2:
                velocidadKmh= motor.torque()*a*2;
                break;
            case 4:
                velocidadKmh= motor.torque()*a*3;
                break;
            case 6:
                velocidadKmh= motor.torque()*a*5;
                break;
        }
        return velocidadKmh;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    public void imprimir_atributos(){
        System.out.println("La placa del auto es: "+placa);
        System.out.println("Modelo del auto es: "+modelo);
        System.out.println("El ano del auto es: "+anio);
        System.out.println("la marca del auto es: "+marca);
        System.out.println("La seria del motor es:"+motor.getSerie());
        System.out.println("El tipo de combustibe del motor es: "+motor.getTipoCombustible());
        System.out.println("El cilindraje es: "+motor.getCilindraje());
        System.out.println("Nombre del propietario: "+duenio.getNombre());
        System.out.println("Cedula: "+duenio.getCedula());
        System.out.println("El numero : "+numRuedas);

    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
}
