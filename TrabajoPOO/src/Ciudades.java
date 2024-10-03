import java.util.Arrays;

public class Ciudades {
    //atributos
    private String nombre;
    private String[][] temperaturas;
    private  int cantidad;

    // constructor

    public Ciudades(String nombre, String[][] temperaturas, int cantidad) {
        this.nombre = nombre;
        this.temperaturas = temperaturas;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[][] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(String[][] temperaturas) {
        this.temperaturas = temperaturas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "nombre='" + nombre + '\'' +
                ", temperaturas=" + Arrays.toString(temperaturas) +
                ", cantidad=" + cantidad +
                '}';
    }
}
