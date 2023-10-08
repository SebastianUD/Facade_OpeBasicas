// Implementación concreta de Salida usando System.out.println
class SalidaTexto extends Salida {
    @Override
    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }
    
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
