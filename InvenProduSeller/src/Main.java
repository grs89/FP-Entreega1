//            String archivoCSV1 = "/Users/grs/eclipse-workspace/InvenProduSeller/src/files/productos.csv";
//            String archivoSalida = "/Users/grs/eclipse-workspace/InvenProduSeller/src/files/archivo_unido.csv";

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String archivoCSVEntrada = "/Users/grs/eclipse-workspace/InvenProduSeller/src/files/productos2.csv"; 
        String archivoCSVSalida = "/Users/grs/eclipse-workspace/InvenProduSeller/src/files/productos.csv"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoCSVEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCSVSalida, true))) {

            // Leer la primera línea del archivo de entrada (encabezados)
            String lineaEncabezados = reader.readLine();
            if (lineaEncabezados != null) {
                writer.write(lineaEncabezados + "\n"); // Agregar encabezados al archivo de salida
            }

            // Leer y agregar datos
            String lineaDatos;
            while ((lineaDatos = reader.readLine()) != null) {
                writer.write(lineaDatos + "\n"); // Agregar cada línea de datos al archivo de salida
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Datos leídos del archivo de entrada y agregados al archivo de salida exitosamente.");
    }
}
