import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Implementación concreta de Salida para escribir en un archivo
class SalidaArchivo extends Salida {
    private String nombreArchivo;

    public SalidaArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrarResultado(String resultado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(resultado);
            System.out.println("Resultado guardado en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
