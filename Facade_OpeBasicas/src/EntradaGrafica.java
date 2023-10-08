import javax.swing.JOptionPane;

// Implementación concreta de Entrada usando JOptionPane
class EntradaGrafica extends Entrada {
    @Override
    public double obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        return Double.parseDouble(input);
    }
    
    @Override
    public String obtenerTexto(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }
}
