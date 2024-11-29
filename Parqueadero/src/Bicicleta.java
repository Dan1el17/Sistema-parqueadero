public class Bicicleta extends Vehiculo{

    private String tipo;

    public Bicicleta(String modelo, String color, String tipo){
        super(null, modelo, color);
        this.tipo = tipo;
    }

    @Override
    public String getMatricula() {
        return "No aplica"; // Sobrescribes el comportamiento
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo: " + tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}

