import javax.swing.*;
import java.util.Arrays;

public class GestorTemperaturas {
    private Ciudades ciudades;

    public GestorTemperaturas(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    //get y set


    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public void IngresarTemperaturas(String[] dias) {
        String[][] temperaturas = ciudades.getTemperaturas();
        String[] nombresCiudades = ciudades.getNombresCiudades();
        for (int i = 0; i < ciudades.getCantidadCiudades(); i++) { //for con la cantidad de cuidades
            nombresCiudades[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre de la ciudad" + (i + 1) + ":"); // en cada posicion

            for (int j = 0; j < dias.length; j++) {
                temperaturas[i][j] = JOptionPane.showInputDialog(null, "Ingrese la temperatura para " + dias[j] + " en " + nombresCiudades[i] + ":");
            }
        }

        for (int i = 0; i < ciudades.getCantidadCiudades(); i++) {
            JOptionPane.showMessageDialog(null, nombresCiudades[i]);
            String tempXDia = "";
            for (int j = 0; j < dias.length; j++) {
                tempXDia = tempXDia + "\n" + dias[j] + " " + temperaturas[i][j];

            }
            JOptionPane.showMessageDialog(null, tempXDia);

        }

    }

    public String CalcularPromedioCiudad() {
        String[][] temperaturas = ciudades.getTemperaturas();
        String[] nombresCiudades = ciudades.getNombresCiudades();
        String resultado = "";
        for (int i = 0; i < temperaturas.length; i++) {
            int suma = 0; // la inicio en 0 para cada ciudad
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma = suma + Integer.parseInt(temperaturas[i][j]);

            }
            int promedio = suma / temperaturas[i].length;
            resultado = resultado + "Ciudad: " + nombresCiudades[i] + "\n" + "Promedio de temperatura: " + promedio;


        }
        return resultado;
    }

    public double temperaturaMaxima() {
        int maximo = 0;
        String[][] temperaturas = ciudades.getTemperaturas();
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                int temp = Integer.parseInt(temperaturas[i][j]);

                if (temp > maximo) {
                    maximo = temp;
                }
            }
        }
        return maximo;
    }
}











