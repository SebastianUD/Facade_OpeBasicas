import java.util.Scanner;

// Implementación concreta de Entrada usando System.out.println
class EntradaTexto extends Entrada {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public double obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
    
    @Override
    public String obtenerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }
}
