// Clase que actúa como una fachada para la aplicación de la calculadora

public class CalculadoraFacade {

    private Entrada entrada;
    private Salida salida;

    public CalculadoraFacade(Entrada entrada, Salida salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public void realizarOperacion() {
        double num1 = entrada.obtenerNumero("Ingrese el primer número: ");
        double num2 = entrada.obtenerNumero("Ingrese el segundo número: ");

        String operacion = entrada.obtenerTexto("Seleccione una operación:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n");

        Operacion operacionSeleccionada = null;

        switch (operacion) {
            case "1" -> operacionSeleccionada = new Suma();
            case "2" -> operacionSeleccionada = new Resta();
            case "3" -> operacionSeleccionada = new Multiplicacion();
            case "4" -> operacionSeleccionada = new Division();
            default -> {
                salida.mostrarMensaje("Operación no válida.");
                return;
            }
        }

        double resultado = operacionSeleccionada.calcular(num1, num2);

        salida.mostrarResultado("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        Entrada entrada;
        Salida salida;

        EntradaGrafica entradaGrafica = new EntradaGrafica();
        SalidaTexto salidaTexto = new SalidaTexto();

        String tipoEntrada = entradaGrafica.obtenerTexto(
                "Seleccione el tipo de entrada:\n1. Entrada grafica\n2. Entrada de texto");

        switch (tipoEntrada) {
            case "1" -> entrada = new EntradaGrafica();
            case "2" -> entrada = new EntradaTexto();
            default -> {
                salidaTexto.mostrarMensaje("Tipo de entrada no valido.");
                return;
            }
        }

        String tipoSalida = entradaGrafica.obtenerTexto(
                "Seleccione el tipo de salida:\n1. Salida grafica\n2. Salida de texto\n3. Salida a archivo");

        switch (tipoSalida) {
            case "1" -> salida = new SalidaGrafica();
            case "2" -> salida = new SalidaTexto();
            case "3" -> {
                String nombreArchivo = entrada.obtenerTexto("Ingrese el nombre del archivo:");
                salida = new SalidaArchivo(nombreArchivo);
            }
            default -> {
                salidaTexto.mostrarMensaje("Tipo de salida no valido.");
                return;
            }
        }

        CalculadoraFacade calculadora = new CalculadoraFacade(entrada, salida);
        calculadora.realizarOperacion();
    }
}
