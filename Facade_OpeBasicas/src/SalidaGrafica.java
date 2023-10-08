import javax.swing.JOptionPane;

// Implementación concreta de Salida usando JOptionPane
class SalidaGrafica extends Salida {
    @Override
    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
