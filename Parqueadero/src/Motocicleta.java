public class Motocicleta extends Vehiculo{
    private String cilindraje;

    public Motocicleta(String matricula, String modelo, String color, String cilindraje){
        super(matricula, modelo, color);
        this.cilindraje = cilindraje;
    }

    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Cilindraje: " + cilindraje;
    }

    public String getCilindraje(){
        return cilindraje;
    }

    public void setCilindraje(String cilindraje){
        this.cilindraje = cilindraje;
    }
}
