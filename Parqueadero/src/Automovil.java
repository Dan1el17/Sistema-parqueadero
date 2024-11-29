public class Automovil extends Vehiculo{

    private String tamaño;

    public Automovil(String matricula, String modelo, String color, String tamaño){
        super(matricula, modelo, color);
        this.tamaño = tamaño;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tamaño: " + tamaño;
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

}
