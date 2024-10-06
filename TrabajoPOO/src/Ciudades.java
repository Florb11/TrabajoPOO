import java.util.Arrays;

public class Ciudades {
    //atributos
    private String [][] temperaturas;
    private String [] nombresCiudades;
    private int cantidadCiudades;

    //constructor


    public Ciudades(String[][] temperaturas, String[] nombresCiudades,int cantidadCiudades) {
        this.temperaturas = temperaturas;
        this.nombresCiudades = nombresCiudades;
        this.cantidadCiudades = cantidadCiudades;
    }


    public String[][] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(String[][] temperaturas) {
        this.temperaturas = temperaturas;
    }

    public String[] getNombresCiudades() {
        return nombresCiudades;
    }

    public void setNombresCiudades(String[] nombresCiudades) {
        this.nombresCiudades = nombresCiudades;
    }

    public int getCantidadCiudades() {
        return cantidadCiudades;
    }

    public void setCantidadCiudades(int cantidadCiudades) {
        this.cantidadCiudades = cantidadCiudades;
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "temperaturas=" + Arrays.toString(temperaturas) +
                ", nombresCiudades=" + Arrays.toString(nombresCiudades) +
                ", cantidadCiudades=" + cantidadCiudades +
                '}';
    }
}
