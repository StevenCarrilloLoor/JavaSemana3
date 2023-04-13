public class Motor {

    String serie;
    double cilindraje;
    String tipoCombustible;

    public Motor(){

    }

    public Motor(String serie, double cilindraje, String tipoCombustible) {
        this.serie = serie;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
    }


    double torque(){
        double torqueNm=0;
        if(tipoCombustible.equals("gasolina")){
            torqueNm=cilindraje*2;
        }else if (tipoCombustible.equals("diesel")){
            torqueNm=cilindraje*4;
        }
        return torqueNm;
    }

    public String getSerie() {
        return serie;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Motor(String serie) {
        this.serie = serie;
    }

}
