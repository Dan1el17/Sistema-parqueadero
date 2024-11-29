public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String color;

    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public String obtenerDetalles() {
        return "Tipo: " + getClass().getSimpleName() +
                ", Matrícula: " + (matricula == null ? "No aplica" : matricula) +
                ", Modelo: " + modelo +
                ", Color: " + color;
    }

    public void mostrarDetalles(){
        System.out.println(obtenerDetalles());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
