import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] dias = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        int cantidadCiudades = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cant ciudades"));
        String[][] temperaturas = new String[cantidadCiudades][dias.length];// las filas coinciden con la cantidad de ciudades y las columnas con los dias ( 7 fijo)
        String [] nombreCiudades = new String[cantidadCiudades]; // los nombres coinciden con la cantidad de ciudades

        Ciudades ciudades = new Ciudades(temperaturas,nombreCiudades,cantidadCiudades);

        GestorTemperaturas gestor = new GestorTemperaturas(ciudades);



        String[] opciones = { "Ingresar datos", "Calcular promedio", "Temperatura Maxima", "Salir" };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "Elija una opción",
                    "Titulo",
                    0,
                    0,
                    null, opciones,
                    opciones[0]);
            switch (opcion) {
                case 0:
                    gestor.IngresarTemperaturas(dias);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,gestor.CalcularPromedioCiudad());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"La temperatura maxima fue: " + gestor.temperaturaMaxima());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;

            }
        } while (opcion != 3);
    }
    }










